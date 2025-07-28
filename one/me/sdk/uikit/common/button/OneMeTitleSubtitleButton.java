package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lmhe;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "title", "Ljue;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "common_release"}, k = 1, mv = {2, 0, 0})
public final class OneMeTitleSubtitleButton extends AppCompatTextView implements mhe {
    public final TextAppearanceSpan A0;
    public final TextAppearanceSpan B0;
    public final u0a C0 = u0a.a;
    public final s0a D0 = s0a.a;
    public final ShapeDrawable E0;
    public final RippleDrawable F0;
    public SpannableString y0;
    public SpannableString z0;

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.TextView, one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton, android.view.View] */
    public OneMeTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0 = new TextAppearanceSpan(context, n9a.b);
        this.B0 = new TextAppearanceSpan(context, n9a.a);
        v0a v0a = v0a.c;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.E0 = shapeDrawable;
        s59 s59 = km4.y0;
        int i = s59.r(this).c().a.c;
        this.F0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        setGravity(17);
        setMinimumHeight(kjd.E(v0a));
        setOutlineProvider(new eu3(kjd.i(v0a)));
        float f = (float) 20;
        float f2 = (float) 4;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        onThemeChanged(s59.r(this));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton] */
    public final void j(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString valueOf;
        SpannableString spannableString;
        SpannableString spannableString2 = null;
        if (charSequence != this.y0) {
            if (charSequence == null || (spannableString = SpannableString.valueOf(charSequence)) == null) {
                spannableString = null;
            } else {
                spannableString.setSpan(this.A0, 0, charSequence.length(), 17);
            }
            this.y0 = spannableString;
        }
        if (charSequence2 != this.z0) {
            if (!(charSequence2 == null || (valueOf = SpannableString.valueOf(charSequence2)) == null)) {
                valueOf.setSpan(this.B0, 0, charSequence2.length(), 17);
                spannableString2 = valueOf;
            }
            this.z0 = spannableString2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence3 = this.y0;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append(charSequence3);
        SpannableString spannableString3 = this.z0;
        if (spannableString3 != null) {
            append.append(10);
            append.append(spannableString3);
        }
        setText(append);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.TextView, one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton, android.view.View] */
    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        pda r = s59.r(this);
        boolean isEnabled = isEnabled();
        u0a u0a = this.C0;
        s0a s0a = this.D0;
        setTextColor(kjd.L(r, u0a, s0a, isEnabled));
        au0 g = kjd.g(s59.r(this), u0a, s0a, isEnabled());
        Paint paint = this.E0.getPaint();
        Integer num = g.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList valueOf = ColorStateList.valueOf(g.b);
        RippleDrawable rippleDrawable = this.F0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void setSubtitle(CharSequence charSequence) {
        j(this.y0, charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        j(charSequence, this.z0);
    }
}
