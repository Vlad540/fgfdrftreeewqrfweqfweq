package defpackage;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: t37  reason: default package */
public abstract class t37 extends LockFreeLinkedListNode implements aj4, jv6 {
    public i47 a;

    public final ok9 b() {
        return null;
    }

    public abstract boolean c();

    public abstract void d(Throwable th);

    public final void dispose() {
        i47 i47 = this.a;
        if (i47 == null) {
            i47 = null;
        }
        i47.removeNode$kotlinx_coroutines_core(this);
    }

    public final boolean isActive() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(a24.F(this));
        sb.append("[job@");
        i47 i47 = this.a;
        if (i47 == null) {
            i47 = null;
        }
        sb.append(a24.F(i47));
        sb.append(']');
        return sb.toString();
    }
}
