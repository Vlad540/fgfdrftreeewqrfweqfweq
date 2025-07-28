package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: kkd  reason: default package */
public final class kkd extends f6c {
    public static final /* synthetic */ k77[] w0;
    public final cx6 X;
    public final s16 Y;
    public final yj Z = new yj(this);
    public final int o;

    static {
        k77 hc9 = new hc9(kkd.class, "isSecure", "isSecure()Z");
        m7c.a.getClass();
        w0 = new k77[]{hc9};
    }

    public kkd(int i, cx6 cx6, oh2 oh2) {
        this.o = i;
        this.X = cx6;
        this.Y = oh2;
    }

    public final int j() {
        return this.o;
    }

    public final void r(b7c b7c, int i) {
        jkd jkd = (jkd) b7c;
        k77 k77 = w0[0];
        boolean booleanValue = ((Boolean) this.Z.b).booleanValue();
        bc3 bc3 = jkd.L0;
        bc3.setSecure(booleanValue);
        bc3.addTextChangedListener(new ikd(jkd, i));
        bc3.setOnKeyListener(new hkd(jkd, i));
        uka uka = new uka(bc3.getContext(), jkd.K0, i, jkd.J0);
        bc3.setCustomSelectionActionModeCallback(uka);
        bc3.setCustomInsertionActionModeCallback(uka);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.TextView, bc3, android.view.View, android.widget.EditText] */
    public final b7c t(ViewGroup viewGroup, int i) {
        ? editText = new EditText(viewGroup.getContext(), (AttributeSet) null);
        editText.setId(xpb.one_me_codeinput_edit_text_view);
        editText.setMinimumWidth(a24.X(((float) 40) * dh4.c().getDisplayMetrics().density));
        editText.setMinimumHeight(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        editText.setInputType(2);
        editText.setGravity(17);
        editText.setFilters(new InputFilter[]{bc3.c});
        nte.b.b(editText, yq4.b);
        editText.setClipToOutline(true);
        editText.setOutlineProvider(new eu3((float) a24.X(((float) 12) * dh4.c().getDisplayMetrics().density)));
        editText.setSingleLine(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.onThemeChanged(km4.y0.r(editText));
        editText.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return new jkd(this, this.o, this.X, editText);
    }
}
