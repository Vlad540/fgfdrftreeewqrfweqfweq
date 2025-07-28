package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: b81  reason: default package */
public final class b81 extends l5e implements m26 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ taf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b81(taf taf, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.x0 = taf;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                b81 b81 = new b81(this.x0, (Continuation) obj4, 0);
                b81.Z = (k11) obj;
                b81.w0 = (zw3) obj2;
                b81.Y = booleanValue;
                jue jue = jue.a;
                b81.o(jue);
                return jue;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                b81 b812 = new b81(this.x0, (Continuation) obj4, 1);
                b812.Y = booleanValue2;
                b812.Z = (eoc) obj2;
                b812.w0 = (bka) obj3;
                return b812.o(jue.a);
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                b81 b813 = new b81(this.x0, (Continuation) obj4, 2);
                b813.Y = booleanValue3;
                b813.Z = (i22) obj2;
                b813.w0 = (ktd) obj3;
                return b813.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        Object value;
        y71 y71;
        SpannableString spannableString;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                k11 k11 = (k11) this.Z;
                zw3 zw3 = (zw3) this.w0;
                boolean z = this.Y;
                d81 d81 = this.x0;
                grd grd = d81.X;
                do {
                    value = grd.getValue();
                    x71 x71 = (x71) value;
                    ete ete = zw3.a;
                    boolean z2 = ete != null && ete.P();
                    b65 b65 = zw3.j;
                    boolean z3 = zw3.f;
                    if (!z3 || !(b65 instanceof z55)) {
                        y71 = x71.b;
                        y71 y712 = y71.b;
                        if (y71 != y712) {
                            y71 = !z3 ? y71.a : y712;
                        }
                    } else {
                        y71 = y71.c;
                    }
                    CharSequence charSequence = k11.b;
                    if (charSequence == null) {
                        charSequence = BuildConfig.FLAVOR;
                    }
                    boolean z4 = z && (b65 instanceof y55);
                    boolean z5 = b65 instanceof z55;
                    xk1 xk1 = d81.o;
                    xk1.getClass();
                    boolean z6 = b65 instanceof a65;
                    Context context = xk1.a;
                    if (z6) {
                        charSequence = context.getString(r1a.f0);
                    } else if (z5 && z3) {
                        charSequence = hr1.g(context.getString(ftb.call_screen_connection_restoring), "...");
                    }
                    spannableString = null;
                    if (!h0e.c0(charSequence)) {
                        boolean z7 = zw3.g;
                        Drawable C = kjd.C((z3 || !z7 || !z2) ? (z3 || !z7) ? z2 ? n1a.B0 : (z5 || !z4) ? n1a.y : cnb.ic_connection_fill_16 : n1a.P : n1a.Q, z4 ? -3259817 : -855638017, context);
                        float f = (float) 16;
                        C.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                        SpannableString spannableString2 = new SpannableString("   " + charSequence + " ");
                        spannableString2.setSpan(new bi5(C, (vh5) null, 6), 0, 1, 17);
                        spannableString = spannableString2;
                    }
                    x71.getClass();
                } while (!grd.b(value, new x71(spannableString, y71)));
                return jue.a;
            case 1:
                wx3.H(obj);
                boolean z8 = this.Y;
                eoc eoc = (eoc) this.Z;
                bka bka = (bka) this.w0;
                if (!z8) {
                    return null;
                }
                int ordinal = eoc.a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (eoc.c) {
                    return null;
                } else {
                    qja d = this.x0.c.d();
                    aoc aoc = eoc.b;
                    if (hhd.f(aoc != null ? aoc.c : null, d.a.getId())) {
                        return null;
                    }
                    qja qja = (qja) bka.c.get(aoc != null ? aoc.c : null);
                    String name = qja != null ? qja.b.getName() : null;
                    if (name == null || h0e.c0(name)) {
                        return null;
                    }
                    return new gme(new jge(r1a.C1, cs.g0(new Object[]{name})), new hge(d.a.m() ? r1a.A1 : r1a.B1));
                }
            default:
                wx3.H(obj);
                boolean z9 = this.Y;
                i22 i22 = (i22) this.Z;
                ktd ktd = (ktd) this.w0;
                ej0 ej0 = ej0.a;
                fj0 fj0 = fj0.c;
                if (z9) {
                    if (i22.b.f(this.x0.D0.s())) {
                        return new tw4(i22.f(fj0, ej0), new hge(c7a.r0), new hge(c7a.q0));
                    }
                }
                CharSequence charSequence2 = null;
                if (z9 && i22.T() && !i22.b.J.b(64)) {
                    String f2 = i22.f(fj0, ej0);
                    tf3 k = i22.k();
                    if (k != null) {
                        charSequence2 = k.m();
                    }
                    return new rw4(f2, charSequence2, i22.e(), new hge(c7a.d), new hge(c7a.c));
                } else if (z9 && i22.F() && !i22.b.J.b(64)) {
                    String f3 = i22.f(fj0, ej0);
                    tf3 k2 = i22.k();
                    if (k2 != null) {
                        charSequence2 = k2.m();
                    }
                    return new rw4(f3, charSequence2, i22.e(), new hge(c7a.b), new hge(c7a.a));
                } else if (!z9 || !i22.J() || i22.F() || i22.E()) {
                    return null;
                } else {
                    return new sw4(ktd);
                }
        }
    }
}
