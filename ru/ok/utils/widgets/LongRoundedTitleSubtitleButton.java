package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lade;", "", "title", "Ljue;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
public final class LongRoundedTitleSubtitleButton extends AppCompatButton implements ade {
    public CharSequence o;
    public CharSequence w0;
    public final TextAppearanceSpan x0;
    public final TextAppearanceSpan y0;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.TextView, ru.ok.utils.widgets.LongRoundedTitleSubtitleButton, android.view.View] */
    public LongRoundedTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        wce wce;
        this.x0 = new TextAppearanceSpan(context, pvb.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Title);
        this.y0 = new TextAppearanceSpan(context, pvb.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ewb.LongRoundedTitleSubtitleButton);
        String string = obtainStyledAttributes.getString(ewb.LongRoundedTitleSubtitleButton_lrts_title);
        String string2 = obtainStyledAttributes.getString(ewb.LongRoundedTitleSubtitleButton_lrts_subtitle);
        b(string == null ? "" : string, string2 == null ? "" : string2);
        obtainStyledAttributes.recycle();
        setGravity(17);
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context2 = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context2);
        }
        z(wce);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, ru.ok.utils.widgets.LongRoundedTitleSubtitleButton] */
    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString valueOf;
        SpannableString valueOf2;
        CharSequence charSequence3 = this.o;
        SpannableString spannableString = null;
        SpannableString spannableString2 = charSequence3;
        if (charSequence != charSequence3) {
            if (charSequence == null || (valueOf2 = SpannableString.valueOf(charSequence)) == null) {
                spannableString2 = null;
            } else {
                valueOf2.setSpan(this.x0, 0, charSequence.length(), 17);
                spannableString2 = valueOf2;
            }
        }
        this.o = spannableString2;
        CharSequence charSequence4 = this.w0;
        if (charSequence2 != charSequence4) {
            if (!(charSequence2 == null || (valueOf = SpannableString.valueOf(charSequence2)) == null)) {
                valueOf.setSpan(this.y0, 0, charSequence2.length(), 17);
                spannableString = valueOf;
            }
            charSequence4 = spannableString;
        }
        this.w0 = charSequence4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence5 = this.o;
        if (charSequence5 == null) {
            charSequence5 = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append(charSequence5);
        CharSequence charSequence6 = this.w0;
        if (charSequence6 != null) {
            append.append("\n").append(charSequence6);
        }
        setText(append);
    }

    public final void setSubtitle(CharSequence charSequence) {
        b(this.o, charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        b(charSequence, this.w0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.TextView, ru.ok.utils.widgets.LongRoundedTitleSubtitleButton] */
    public final void z(wce wce) {
        js.a(wce, this, a24.X(((float) 42) * dh4.c().getDisplayMetrics().density));
    }
}
