package defpackage;

import org.json.JSONObject;

/* renamed from: x66  reason: default package */
public final class x66 implements pfd {
    public final JSONObject a;

    public x66(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final JSONObject a() {
        return this.a;
    }

    public final void b(int i, String str) {
        this.a.put(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x66) && hhd.f(this.a, ((x66) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericCommand(params=" + this.a + ")";
    }
}
