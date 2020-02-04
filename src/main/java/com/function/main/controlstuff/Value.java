package com.function.main.controlstuff;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Value implements Comparable<Value> {
    public static final Value VOID = new Value();
    public static final Value NULL = new Value() {
        @Override
        public Map<String, Value> getProperties() {
            throw new NullPointerException();
        }

        @Override
        public String toString() {
            return "null";
        }
    };
    public static final Value BREAK = new Value();
    public static final Value CONTINUE = new Value();
    private static final Object EMPTY = new Object();
    private static final Object OBJECT = new Object() {
        @Override
        public String toString() {
            return "[object Object]";
        }
    };
    private final Object value;

    private final Map<String, Value> properties;

    public static Value valueOf(Boolean obj) {
        return obj ? Value.TRUE : Value.FALSE;
    }

    public static Value valueOf(String obj) {
        Value value = new Value(obj);
        value.getProperties().put("length", Value.valueOf(obj.length()));
        value.getProperties().put("toNum", new FunFunction(
                Collections.emptyList(),
                values -> Value.valueOf(Double.parseDouble(obj))
        ));
        value.getProperties().put("replace", new FunFunction(
                Arrays.asList("target", "replacement"),
                values -> Value.valueOf(obj.replace(values.get(0).asString(), values.get(1).asString()))
        ));
        return value;
    }

    public static Value valueOf(List<Value> obj) {
        Value value = new Value(obj);
        Map<String, Value> properties = value.getProperties();
        properties.put("length", Value.valueOf(obj.size()));
        properties.put("map", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    FunFunction lambda = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + values.get(0)));
                    List<Value> list = obj.stream()
                            .map(Collections::singletonList)
                            .map(lambda.getFunction())
                            .collect(Collectors.toList());
                    return Value.valueOf(list);
                },
                value
        ));
        properties.put("filter", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    FunFunction lambda = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + values.get(0)));
                    List<Value> list = obj.stream()
                            .filter(val -> lambda.getFunction().apply(Collections.singletonList(val))
                                    .asBoolean(() -> new RuntimeException("expected Boolean: " + val)))
                            .collect(Collectors.toList());
                    return Value.valueOf(list);
                },
                value
        ));
        properties.put("sorted", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    FunFunction lambda = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + values.get(0)));
                    List<Value> list = obj.stream()
                            .sorted(
                                    Comparator.comparingInt(
                                            val -> lambda.getFunction().apply(Collections.singletonList(val))
                                                    .asInteger(() -> new RuntimeException("expected integer: " + val))
                                    )
                            )
                            .collect(Collectors.toList());
                    return Value.valueOf(list);
                }
        ));
        properties.put("add", new FunFunction(
                Collections.singletonList("value"),
                values -> {
                    obj.add(values.get(0));
                    return VOID;
                }
        ));
        properties.put("insert", new FunFunction(
                Arrays.asList("index", "value"),
                values -> {
                    obj.add(values.get(0).asInteger(() -> new RuntimeException("expected integer: " + value)), values.get(1));
                    return VOID;
                }
        ));
        properties.put("removeAt", new FunFunction(
                Collections.singletonList("index"),
                values -> {
                    obj.remove(values.get(0).asInteger(() -> new RuntimeException("expected integer: " + value)).intValue());
                    return VOID;
                }
        ));
        properties.put("indexOf", new FunFunction(
                Collections.singletonList("value"),
                values -> {
                    int index = obj.indexOf(values.get(0));
                    return Value.valueOf(index);
                }
        ));
        properties.put("lastIndexOf", new FunFunction(
                Collections.singletonList("value"),
                values -> {
                    int index = obj.lastIndexOf(values.get(0));
                    return Value.valueOf(index);
                }
        ));
        properties.put("clone", new FunFunction(
                Collections.emptyList(),
                values -> Value.valueOf(new ArrayList<>(obj))
        ));
        properties.put("addAll", new FunFunction(
                Collections.singletonList("list"),
                values -> {
                    obj.addAll(values.get(0).asList(() -> new RuntimeException("expected list: " + value)));
                    return VOID;
                }
        ));
        properties.put("insertAll", new FunFunction(
                Arrays.asList("index", "list"),
                values -> {
                    Integer index = values.get(0).asInteger(() -> new RuntimeException("expected list: " + value));
                    obj.addAll(index, values.get(1).asList(() -> new RuntimeException("expected list: " + value)));
                    return VOID;
                }
        ));
        properties.put("removeAll", new FunFunction(
                Collections.singletonList("list"),
                values -> {
                    obj.removeAll(values.get(0).asList(() -> new RuntimeException("expected list: " + value)));
                    return VOID;
                }
        ));
        properties.put("removeIf", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    Function<List<Value>, Value> function = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + value)).getFunction();
                    obj.removeIf(val -> function.apply(Collections.singletonList(val))
                            .asBoolean(() -> new RuntimeException("expected boolean: " + value)));
                    return VOID;
                }
        ));
        properties.put("replaceAll", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    Function<List<Value>, Value> function = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + value))
                            .getFunction();
                    obj.replaceAll(val ->
                            function.apply(Collections.singletonList(val))
                    );
                    return VOID;
                }
        ));
        properties.put("anyMatch", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    Function<List<Value>, Value> function = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + value))
                            .getFunction();
                    return Value.valueOf(obj.stream().anyMatch(val ->
                            function.apply(Collections.singletonList(val))
                                    .asBoolean(() -> new RuntimeException("expected boolean: " + value))
                    ));
                }
        ));
        properties.put("allMatch", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    Function<List<Value>, Value> function = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + value))
                            .getFunction();
                    return Value.valueOf(obj.stream().allMatch(val ->
                            function.apply(Collections.singletonList(val))
                                    .asBoolean(() -> new RuntimeException("expected boolean: " + value))
                    ));
                }
        ));
        properties.put("noneMatch", new FunFunction(
                Collections.singletonList("lambda"),
                values -> {
                    Function<List<Value>, Value> function = values.get(0)
                            .asFunction(() -> new RuntimeException("expected lambda: " + value))
                            .getFunction();
                    return Value.valueOf(obj.stream().noneMatch(val ->
                            function.apply(Collections.singletonList(val))
                                    .asBoolean(() -> new RuntimeException("expected boolean: " + value))
                    ));
                }
        ));
        properties.put("clear", new FunFunction(
                Collections.emptyList(),
                values -> {
                    obj.clear();
                    return VOID;
                }
        ));
        properties.put("contains", new FunFunction(
                Collections.singletonList("value"),
                values -> Value.valueOf(obj.contains(values.get(0)))
        ));

        return value;
    }

    public static Value valueOf(Map<String, Value> obj) {
        Value value = new Value(OBJECT);
        value.getProperties().putAll(obj);
        return value;
    }

    public static final Value TRUE = new Value(true, false);
    public static final Value FALSE = new Value(false, false);

    public static Value valueOf(Double obj) {
        return new Value(obj);
    }

    public static Value valueOf(Integer obj) {
        return new Value(obj.doubleValue());
    }

    protected Value(Object value) {
        this(value, true);
    }

    protected Value(Object value, boolean hasProperties) {
        this.value = value;
        this.properties = hasProperties ? new HashMap<>() : Collections.emptyMap();
    }

    private Value() {
        this.value = EMPTY;
        this.properties = Collections.emptyMap();
    }

    public Map<String, Value> getProperties() {
        return properties;
    }

    public Boolean asBoolean(Supplier<? extends RuntimeException> ex) {
        if (!isBoolean()) {
            throw ex.get();
        }
        return (Boolean) value;
    }

    @SuppressWarnings("unchecked")
    public List<Value> asList(Supplier<? extends RuntimeException> ex) {

        if (!isList()) {
            throw ex.get();
        }
        return (List<Value>) value;
    }

    public Double asDouble(Supplier<? extends RuntimeException> ex) {
        if (!isDouble()) {
            throw ex.get();
        }
        return (Double) value;
    }

    public FunFunction asFunction(Supplier<? extends RuntimeException> ex) {
        throw ex.get();
    }

    public FunClass asClass(Supplier<? extends RuntimeException> ex) {
        throw ex.get();
    }

    public Integer asInteger(Supplier<? extends RuntimeException> ex) {

        if (!(value instanceof Number)) {
            throw ex.get();
        }

        return ((Number) value).intValue();
    }

    public String asString() {
        if (isObject()) {
            Map<String, Value> properties = getProperties();
            if (properties.containsKey("toString")) {
                FunFunction funFunction = properties.get("toString").asFunction(() -> new RuntimeException("expected lambda: " + properties.get("toString")));
                return funFunction.getFunction().apply(Collections.emptyList()).asString();
            }
        }
        String s = String.valueOf(this.value);
        if (isDouble() && s.endsWith(".0")) {
            return s.substring(0, s.length() - 2);
        }

        return s;
    }

    private boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isList() {
        return value instanceof List;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isObject() {
        return value == OBJECT;
    }

    public boolean isFunction() {
        return false;
    }

    public boolean isClass() {
        return false;
    }

    public boolean isInteger() {
        if (value instanceof Number) {
            Number value = (Number) this.value;
            return value.intValue() == value.doubleValue();
        }
        return false;
    }

    @Override
    public String toString() {
        return asString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value that = (Value) o;
        if (this.isObject() && that.isObject()) {
            Map<String, Value> properties = getProperties();
            if (properties.containsKey("equals")) {
                FunFunction funFunction = properties.get("equals").asFunction(() -> new RuntimeException("expected lambda: " + properties.get("equals")));
                return funFunction.getFunction().apply(Collections.singletonList(that)).asBoolean(() -> new RuntimeException("Expected boolean: "));
            } else {
                return this.properties.equals(that.properties);
            }
        } else {
            return Objects.equals(this.value, that.value);
        }
    }

    @Override
    public int hashCode() {
        if (value == null) return 0;
        return Objects.hash(value, properties);
    }

    @Override
    public int compareTo(Value that) {
        if (this.isDouble() && that.isDouble()) {
            if (this.equals(that)) {
                return 0;
            } else {
                return this.asDouble(null).compareTo(that.asDouble(null));
            }
        } else if (this.value instanceof String && that.value instanceof String) {
            return this.asString().compareTo(that.asString());
        } else {
            throw new RuntimeException("illegal expression: can't compare `" + this + "` to `" + that + "`");
        }
    }

    public boolean isString() {
        return value instanceof String;
    }
}
