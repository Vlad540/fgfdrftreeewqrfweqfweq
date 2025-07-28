package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: n87  reason: default package */
public final class n87 extends FrameLayout implements mhe {
    public static final /* synthetic */ k77[] c;
    public final TextView a;
    public final yj b = new yj(10, this, (sz9) sz9.g.getValue());

    static {
        k77 hc9 = new hc9(n87.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;");
        m7c.a.getClass();
        c = new k77[]{hc9};
    }

    public n87(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setId(qhc.A0);
        nte.p.b(textView, yq4.b);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLetterSpacing(0.0f);
        textView.setSingleLine(true);
        this.a = textView;
        b(getTabItem().c, km4.y0.r(this));
        setLayoutParams(new ViewGroup.LayoutParams(a24.X(((float) 72) * dh4.c().getDisplayMetrics().density), -2));
        setClipToPadding(false);
        addView(textView);
    }

    public static final void a(n87 n87) {
        n87.setText(n87.getTabItem().b);
        m87 b2 = b(n87.getTabItem().c, km4.y0.r(n87));
        n87.getClass();
        n87.a.setTextColor(b2.a);
        n87.requestLayout();
        n87.invalidate();
    }

    public static m87 b(int i, pda pda) {
        int t = hr1.t(i);
        if (t == 0) {
            return new m87(pda.getText().e);
        }
        if (t == 1) {
            return new m87(pda.getText().f);
        }
        if (t == 2) {
            return new m87(pda.c().c.h);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final sz9 getTabItem() {
        k77 k77 = c[0];
        return (sz9) this.b.b;
    }

    public final void onThemeChanged(pda pda) {
        this.a.setTextColor(b(getTabItem().c, pda).a);
        km4.d(km4.y0.n(getContext()), this);
    }

    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(sz9.a(getTabItem(), (CharSequence) null, z ? 1 : 2, (pz9) null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(sz9 sz9) {
        this.b.o1(this, c[0], sz9);
    }
}
