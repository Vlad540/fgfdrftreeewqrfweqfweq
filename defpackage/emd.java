package defpackage;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: emd  reason: default package */
public abstract class emd {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
