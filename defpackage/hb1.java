package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: hb1  reason: default package */
public final class hb1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jb1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb1(jb1 jb1, Continuation continuation) {
        super(2, continuation);
        this.Y = jb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hb1) n((i61) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hb1 hb1 = new hb1(this.Y, continuation);
        hb1.X = obj;
        return hb1;
    }

    public final Object o(Object obj) {
        Object value;
        SpannableStringBuilder spannableStringBuilder;
        wx3.H(obj);
        i61 i61 = (i61) this.X;
        boolean z = i61 instanceof g61;
        jue jue = jue.a;
        if (z) {
            Long l = this.Y.Y;
            g61 g61 = (g61) i61;
            long j = g61.a.b;
            if (l == null || l.longValue() != j) {
                return jue;
            }
            this.Y.Y = null;
            this.Y.s(true, g61.a.X, (String) null, (Long) null);
        } else if (i61 instanceof h61) {
            Long l2 = this.Y.Y;
            long j2 = ((h61) i61).a;
            if (l2 == null || l2.longValue() != j2) {
                return jue;
            }
            this.Y.Y = null;
            jb1 jb1 = this.Y;
            grd grd = jb1.Z;
            do {
                value = grd.getValue();
                nu7 nu7 = jb1.c;
                nu7.getClass();
                int i = j1a.g;
                Context context = (Context) nu7.a;
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i));
                spannableStringBuilder.setSpan(new whe(km4.y0.n(context).g(), new v81(nu7, 0)), 0, spannableStringBuilder.length(), 17);
            } while (!grd.b(value, za1.a((za1) value, (ub0) null, (String) null, new va1(new lge(spannableStringBuilder)), (mge) null, false, 499)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}
