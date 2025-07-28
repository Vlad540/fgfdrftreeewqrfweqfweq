package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: el1  reason: default package */
public final class el1 extends ConstraintLayout {
    public final r7e K0 = new r7e(new di1(9));
    public final dgc L0;
    public final dgc M0;
    public final AppCompatTextView N0;
    public final AppCompatTextView O0;
    public gl1 P0;
    public raf Q0;
    public Integer R0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public el1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        setLayoutParams(new re3(-1, -2));
        dgc dgc = new dgc(context2, (AttributeSet) null);
        dgc.setId(uob.call_collapsing);
        dgc.y(cnb.ic_chevron_down_24, -855638017);
        dgc.setAccessibility(Integer.valueOf(ftb.call_collapsing_accessibility));
        yfc yfc = yfc.a;
        dgc.setMode(yfc);
        dgc.setListener(new cl1(this, 0));
        float f = (float) 40;
        dgc.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        float f2 = (float) 3;
        dgc.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        dgc.setLayoutParams(new re3(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(uob.call_name);
        appCompatTextView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(1);
        nge nge = nte.n;
        nge.d(nge, appCompatTextView);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setVisibility(8);
        this.N0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(uob.call_status);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        nge.d(nge, appCompatTextView2);
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setVisibility(8);
        this.O0 = appCompatTextView2;
        dgc dgc2 = new dgc(context2, (AttributeSet) null);
        dgc2.setId(uob.call_mode);
        dgc2.y(cnb.ic_call_mode_default_18, -855638017);
        dgc2.setMode(yfc);
        float f3 = (float) 4;
        dgc2.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f3));
        dgc2.setAccessibility(Integer.valueOf(ftb.call_video_mode_accessibility));
        dgc2.setListener(new cl1(this, 1));
        dgc2.setVisibility(4);
        dgc2.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc2.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        dgc2.setLayoutParams(new re3(-2, -2));
        this.M0 = dgc2;
        dgc dgc3 = new dgc(context2, (AttributeSet) null);
        dgc3.setId(uob.call_add_member);
        dgc3.y(cnb.ic_add_user_18, -855638017);
        dgc3.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f3));
        dgc3.setAccessibility(Integer.valueOf(ftb.call_member_add_accessibility));
        dgc3.setTextColor(-1);
        dgc3.setMode(yfc);
        dgc3.setListener(new cl1(this, 2));
        dgc3.setMinWidth(a24.X(dh4.c().getDisplayMetrics().density * f));
        dgc3.setShape(xfc.b);
        dgc3.setVisibility(4);
        dgc3.setButtonPadding(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        dgc3.setImageSize(new zfc(-2, a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc3.setLayoutParams(new re3(-2, -2));
        this.L0 = dgc3;
        addView(dgc);
        addView(appCompatTextView, 0, -2);
        addView(appCompatTextView2, -2, -2);
        addView(dgc2);
        addView(dgc3);
        bf3 p = a06.p(this);
        int id = dgc.getId();
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        int id2 = appCompatTextView.getId();
        p.d(id2, 7, dgc2.getId(), 6);
        new hw9(p, 7, id2, 4).e(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
        p.d(id2, 6, dgc.getId(), 7);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id2, 4));
        p.d(id2, 3, 0, 3);
        p.g(id2).d.l0 = true;
        int id3 = appCompatTextView2.getId();
        p.d(id3, 7, appCompatTextView.getId(), 7);
        p.d(id3, 6, appCompatTextView.getId(), 6);
        p.d(id3, 3, appCompatTextView.getId(), 4);
        new hw9(p, 3, id3, 4).e(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
        int id4 = dgc2.getId();
        p.d(id4, 7, dgc3.getId(), 6);
        new hw9(p, 7, id4, 4).e(a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p.d(id4, 6, appCompatTextView.getId(), 7);
        p.d(id4, 3, 0, 3);
        int id5 = dgc3.getId();
        p.d(id5, 7, 0, 7);
        p.d(id5, 3, 0, 3);
        p.a(this);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getContextHeight() {
        /*
            r4 = this;
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0010
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0011
        L_0x0010:
            r1 = r3
        L_0x0011:
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r1.bottomMargin
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0024
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x0024:
            if (r3 == 0) goto L_0x0028
            int r2 = r3.topMargin
        L_0x0028:
            int r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el1.getContextHeight():int");
    }

    private final f21 getContextMenuDelegate() {
        return (f21) this.K0.getValue();
    }

    public static void w(el1 el1) {
        f21 contextMenuDelegate = el1.getContextMenuDelegate();
        zq3 a = contextMenuDelegate.a(el1.getContext(), z6.a, new j9(contextMenuDelegate, 8, el1));
        a.showAtLocation(el1, 49, 0, el1.getContextHeight());
        a.setOnDismissListener(new b01(1, el1));
        dgc dgc = el1.M0;
        dgc.setIconTint(-15987442);
        dgc.setMode(yfc.o);
    }

    public final void setCallTime(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.O0;
        appCompatTextView.setText(charSequence);
        mt0.k(appCompatTextView, !(charSequence == null || h0e.c0(charSequence)), 0, (u16) null, 6);
    }

    public final void setClickListener(gl1 gl1) {
        this.P0 = gl1;
    }

    public final void setMembers(Integer num) {
        if (!hhd.f(this.R0, num)) {
            this.R0 = num;
            boolean z = false;
            int i = num != null ? 0 : 4;
            dgc dgc = this.L0;
            dgc.setVisibility(i);
            if (num != null) {
                if (num.intValue() <= 1) {
                    z = true;
                }
                dgc.y(z ? cnb.ic_add_user_18 : cnb.ic_add_more_users_22, -855638017);
                Integer num2 = z ^ true ? num : null;
                dgc.setText(num2 == null ? BuildConfig.FLAVOR : num2.intValue() < 1000 ? num2.toString() : num2.intValue() < 1000000 ? getContext().getString(ftb.call_opponent_thousend_size, new Object[]{String.valueOf(num2.intValue() / 1000)}) : num2.intValue() < 100000000 ? getContext().getString(ftb.call_opponent_million_size, new Object[]{String.valueOf(num2.intValue() / 1000000)}) : num2.toString());
                dgc.setAccessibility(z ? getContext().getString(ftb.call_member_add_accessibility) : String.format(getContext().getString(ftb.call_member_add_more_accessibility), Arrays.copyOf(new Object[]{num.toString()}, 1)));
            }
        }
    }

    public final void setMode(raf raf) {
        if (this.Q0 != raf) {
            this.Q0 = raf;
            int i = raf == null ? -1 : dl1.$EnumSwitchMapping$0[raf.ordinal()];
            Integer num = null;
            if (i != -1) {
                if (i == 1) {
                    num = Integer.valueOf(cnb.ic_call_mode_default_18);
                } else if (i == 2) {
                    num = Integer.valueOf(cnb.ic_call_mode_grid_24);
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            dgc dgc = this.M0;
            if (num == null) {
                dgc.setVisibility(4);
            } else {
                dgc.setVisibility(0);
            }
            if (num != null) {
                dgc.y(num.intValue(), -855638017);
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.N0;
        if (!hhd.f(appCompatTextView.getText(), charSequence)) {
            appCompatTextView.setText(charSequence);
            mt0.k(appCompatTextView, !(charSequence == null || h0e.c0(charSequence)), 0, (u16) null, 6);
        }
    }
}
