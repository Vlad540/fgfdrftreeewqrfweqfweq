package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: go  reason: default package */
public abstract class go {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
