package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: e41  reason: default package */
public final class e41 implements pg7 {
    public final long a;
    public final CharSequence b;
    public final long c;
    public final int o = uob.call_event_view_item;

    public e41(long j, SpannableStringBuilder spannableStringBuilder) {
        this.a = j;
        this.b = spannableStringBuilder;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e41)) {
            return false;
        }
        e41 e41 = (e41) obj;
        return this.a == e41.a && hhd.f(this.b, e41.b);
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "CallEventItemView(id=" + this.a + ", text=" + this.b + ")";
    }
}
