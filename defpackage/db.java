package defpackage;

/* renamed from: db  reason: default package */
public final class db implements kb {
    public final boolean a;

    public db(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        dbVar.getClass();
        return this.a == dbVar.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("DisableAllScreenRecordInCall(isSuccess=true, isEnabled="), this.a, ")");
    }
}
