package defpackage;

/* renamed from: j7e  reason: default package */
public final class j7e extends kh0 {
    public final boolean b;

    public j7e(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7e) && this.b == ((j7e) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("SyncMutedChatsEvent(isSuccessful="), this.b, ")");
    }
}
