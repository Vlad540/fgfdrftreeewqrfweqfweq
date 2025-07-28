package ru.ok.android.api.json;

public final class JsonStateException extends IllegalStateException {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException a(int i) {
        return new IllegalStateException("Expected " + ct0.M(93) + " was " + ct0.M(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException b(int i) {
        return new IllegalStateException("Expected " + ct0.M(125) + " was " + ct0.M(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException c(int i) {
        return new IllegalStateException("Expected " + ct0.M(39) + " was " + ct0.M(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException d(int i) {
        return new IllegalStateException("Expected value was ".concat(ct0.M(i)));
    }
}
