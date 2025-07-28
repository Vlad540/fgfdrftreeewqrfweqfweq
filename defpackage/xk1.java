package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: xk1  reason: default package */
public final class xk1 {
    public final Context a;

    public xk1(Context context) {
        this.a = context;
    }

    public static String d(Long l) {
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        long j = (long) 3600;
        long j2 = longValue / j;
        long j3 = (long) 60;
        long j4 = (longValue % j) / j3;
        long j5 = longValue % j3;
        return j2 > 0 ? String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public final e41 a(ndf ndf) {
        Drawable drawable;
        c41 c41 = (c41) ndf;
        boolean equals = c41.equals(p31.c);
        Context context = this.a;
        if (equals) {
            drawable = kjd.C(snb.check_outline_16, -855638017, context);
        } else if (c41.equals(q31.c)) {
            drawable = g();
        } else if (c41.equals(s31.c)) {
            drawable = kjd.C(cnb.ic_connection_fill_16, -3259817, context);
        } else if (!c41.equals(y31.c)) {
            return null;
        } else {
            drawable = kjd.C(snb.ic_microphone_off_fill_16, -855638017, context);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(ndf.a));
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new bi5(drawable, (vh5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        return new e41((long) c41.getPriority(), spannableStringBuilder);
    }

    public final SpannableStringBuilder b(boolean z) {
        Integer valueOf = Integer.valueOf(ftb.call_incoming_video_call);
        if (!z) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : ftb.call_incoming_audio_call;
        Context context = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rf0.h("   ", context.getString(intValue)));
        Drawable b = gq3.b(context, n1a.U);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new bi5(b, (vh5) null, 6), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, boolean z, int i, boolean z2, boolean z3, boolean z4, b65 b65) {
        oj7 oj7;
        if (charSequence == null) {
            return null;
        }
        if (z && (((b65 instanceof x55) || (b65 instanceof z55)) && z3)) {
            oj7 = g();
        } else if (z || !z2 || (b65 instanceof x55) || (b65 instanceof z55)) {
            Context context = this.a;
            if (!z && z4) {
                oj7 = kjd.C(cnb.ic_share_screen_20, -855638017, context);
                float f = (float) 12;
                oj7.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
            } else if (i == 2) {
                oj7 = kjd.C(cnb.ic_microphone_disable_12, -855638017, context);
                float f2 = (float) 12;
                oj7.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
            } else if (i == 1) {
                oj7 gkd = new gkd(km4.y0.n(context).g(), new hd1(2));
                float f3 = (float) 12;
                gkd.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
                oj7 = gkd;
            } else {
                oj7 = null;
            }
        } else {
            oj7 = g();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (oj7 != null) {
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new bi5(oj7, (vh5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final String e(boolean z, boolean z2, boolean z3, b65 b65) {
        Context context = this.a;
        if (!z3 && !z2 && (((b65 instanceof x55) || (b65 instanceof z55)) && !z)) {
            return context.getString(ftb.call_waiting);
        }
        if (((b65 instanceof x55) || (b65 instanceof z55)) && !z3) {
            return context.getString(ftb.call_connecting);
        }
        if (!(b65 instanceof u55)) {
            return null;
        }
        switch (wk1.$EnumSwitchMapping$0[hr1.t(((u55) b65).b)]) {
            case 1:
                return context.getString(ftb.call_opponent_unavailable);
            case 2:
                return context.getString(ftb.call_opponent_unavailable_busy);
            case 3:
                return context.getString(ftb.call_opponent_failed);
            case 4:
                return context.getString(ftb.call_opponent_unavailable_privacy);
            case 5:
                return context.getString(ftb.call_opponent_failed_timout);
            case 6:
                return context.getString(ftb.call_group_was_removed_from_call);
            case 7:
                return context.getString(ftb.call_group_was_removed_from_waiting_room);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder f(boolean r9, int r10, java.lang.CharSequence r11, boolean r12, boolean r13, boolean r14, boolean r15, defpackage.b65 r16) {
        /*
            r8 = this;
            r0 = r11
            r1 = r8
            android.content.Context r2 = r1.a
            r3 = 0
            if (r9 != 0) goto L_0x002a
            if (r15 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x001e
            r3 = 1
            char[] r3 = new char[r3]
            r4 = 32
            r5 = 0
            r3[r5] = r4
            java.util.List r0 = defpackage.h0e.p0(r11, r3)
            java.lang.Object r0 = defpackage.o23.X(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x001e:
            int r0 = defpackage.r1a.e0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r2.getString(r0, r3)
        L_0x0028:
            r3 = r0
            goto L_0x0038
        L_0x002a:
            if (r12 != 0) goto L_0x002f
            if (r9 != 0) goto L_0x002f
            goto L_0x0038
        L_0x002f:
            if (r9 == 0) goto L_0x0028
            int r0 = defpackage.ftb.call_me_member
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0028
        L_0x0038:
            r0 = r8
            r1 = r3
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            android.text.SpannableStringBuilder r0 = r0.c(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk1.f(boolean, int, java.lang.CharSequence, boolean, boolean, boolean, boolean, b65):android.text.SpannableStringBuilder");
    }

    public final oj7 g() {
        oj7 oj7 = new oj7(n1a.S, -1, this.a);
        float f = (float) 12;
        oj7.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        return oj7;
    }

    public final String h(Long l, yh1 yh1) {
        String d = d(l);
        String str = null;
        if (!yh1.c) {
            return null;
        }
        if (yh1.a) {
            return d;
        }
        int i = r1a.D1;
        qja qja = yh1.f;
        if (qja != null) {
            str = qja.b.getName();
        }
        return this.a.getString(i, new Object[]{str, d});
    }
}
