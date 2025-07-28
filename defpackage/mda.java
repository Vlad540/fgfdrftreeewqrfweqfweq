package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mda  reason: default package */
public final class mda extends LinearLayout implements mhe {
    public static final /* synthetic */ k77[] B0;
    public final t97 A0;
    public final EditText a;
    public final lda b = new lda(this, 0);
    public final lda c = new lda(this);
    public final lda o = new lda(new InputFilter[0], this, 2);
    public final lda w0 = new lda(Integer.valueOf(j9a.L), this, 3);
    public final lda x0 = new lda(Integer.valueOf(j9a.M), this, 4);
    public final lda y0 = new lda(this, 5);
    public final t97 z0;

    static {
        Class<mda> cls = mda.class;
        B0 = new k77[]{new hc9(cls, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), c3d.g(m7c.a, cls, "hint", "getHint()Ljava/lang/String;"), new hc9(cls, "filters", "getFilters()[Landroid/text/InputFilter;"), new hc9(cls, "textColorAttr", "getTextColorAttr()I"), new hc9(cls, "hintColorAttr", "getHintColorAttr()I"), new hc9(cls, "currentPlaceholderType", "getCurrentPlaceholderType()Lone/me/sdk/uikit/common/views/OneMeTextInput$PlaceholderType;")};
    }

    public mda(Context context) {
        super(context, (AttributeSet) null);
        EditText editText = new EditText(context);
        editText.setMinimumHeight(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        editText.setBackground((Drawable) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        nte.k.b(editText, yq4.b);
        float f = (float) 12;
        editText.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), editText.getPaddingTop(), a24.X(dh4.c().getDisplayMetrics().density * f), editText.getPaddingBottom());
        editText.setClipToOutline(true);
        editText.setOutlineProvider(new eu3((float) a24.X(((float) 16) * dh4.c().getDisplayMetrics().density)));
        editText.setCompoundDrawablePadding(a24.X(f * dh4.c().getDisplayMetrics().density));
        editText.setImportantForAutofill(1);
        editText.setSingleLine(true);
        editText.setInputType(editText.getInputType() | 16384);
        setOnClearIconClick(editText);
        editText.addTextChangedListener(new ae1(editText, 8, this));
        this.a = editText;
        this.z0 = ez3.O(3, new zu4((Object) context, 27, (Object) this));
        this.A0 = ez3.O(3, new qk8(17, this));
        setOrientation(1);
        addView(editText);
    }

    private final kda getCurrentPlaceholderType() {
        k77 k77 = B0[5];
        return (kda) this.y0.b;
    }

    private final TextView getPlaceholderView() {
        return (TextView) this.z0.getValue();
    }

    private final void setCurrentPlaceholderType(kda kda) {
        this.y0.o1(this, B0[5], kda);
    }

    private final void setOnClearIconClick(EditText editText) {
        editText.setOnTouchListener(new jg1(4, editText));
    }

    public final void a() {
        getPlaceholderView().setText((CharSequence) null);
        getPlaceholderView().setVisibility(8);
        setCurrentPlaceholderType((kda) null);
    }

    public final void b(u16 u16) {
        this.a.addTextChangedListener(new z2(7, u16));
    }

    public final boolean c() {
        return getCurrentPlaceholderType() == kda.a && ek8.L(this.z0);
    }

    public final void d(String str, kda kda) {
        if (!hhd.f(getPlaceholderView().getText(), str) || kda != getCurrentPlaceholderType()) {
            getPlaceholderView().setText(str);
            getPlaceholderView().setVisibility(0);
            setCurrentPlaceholderType(kda);
        }
    }

    public final void e(pda pda, kda kda) {
        int i;
        int ordinal = kda.ordinal();
        if (ordinal == 0) {
            i = pda.getText().b;
        } else if (ordinal == 1) {
            i = pda.getText().e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        t97 t97 = this.z0;
        if (t97.a()) {
            ((TextView) t97.getValue()).setTextColor(i);
        }
    }

    public final Integer getBackgroundColorAttr() {
        k77 k77 = B0[0];
        return (Integer) this.b.b;
    }

    public final InputFilter[] getFilters() {
        k77 k77 = B0[2];
        return (InputFilter[]) this.o.b;
    }

    public final String getHint() {
        k77 k77 = B0[1];
        return (String) this.c.b;
    }

    public final int getHintColorAttr() {
        k77 k77 = B0[4];
        return ((Number) this.x0.b).intValue();
    }

    public final CharSequence getText() {
        Editable text = this.a.getText();
        return text.subSequence(0, text.length());
    }

    public final int getTextColorAttr() {
        k77 k77 = B0[3];
        return ((Number) this.w0.b).intValue();
    }

    public final void onThemeChanged(pda pda) {
        EditText editText = this.a;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            pda.getText();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        s59 s59 = km4.y0;
        if (backgroundColorAttr != null) {
            editText.setBackgroundColor(s59.r(this).i(backgroundColorAttr.intValue()));
        }
        editText.setTextColor(s59.r(this).i(getTextColorAttr()));
        editText.setHintTextColor(s59.r(this).i(getHintColorAttr()));
        t97 t97 = this.A0;
        if (t97.a()) {
            ((Drawable) t97.getValue()).setTint(s59.r(this).getIcon().i);
        }
        kda currentPlaceholderType = getCurrentPlaceholderType();
        if (currentPlaceholderType != null) {
            e(pda, currentPlaceholderType);
        }
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.o1(this, B0[0], num);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        this.o.o1(this, B0[2], inputFilterArr);
    }

    public final void setHint(String str) {
        this.c.o1(this, B0[1], str);
    }

    public final void setHintColorAttr(int i) {
        this.x0.o1(this, B0[4], Integer.valueOf(i));
    }

    public final void setInputType(int i) {
        this.a.setInputType(i);
    }

    public final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void setTextColorAttr(int i) {
        this.w0.o1(this, B0[3], Integer.valueOf(i));
    }
}
