package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import java.util.NoSuchElementException;

/* renamed from: ge  reason: default package */
public abstract class ge {
    public static final p7c a = new p7c("[\\n\\r]");
    public static final p7c b = new p7c("\\s{2,}");

    public static Spannable a(Spannable spannable) {
        int i;
        int i2;
        if (spannable.length() == 0) {
            return spannable;
        }
        if (h0e.B0(spannable).length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(spannable);
        int length = spannableString.length();
        char[] cArr = new char[length];
        int i3 = 0;
        spannableString.getChars(0, length, cArr, 0);
        if (Character.isSpaceChar(cArr[0]) || cArr[0] == 10) {
            i = 0;
            while (i < length && (Character.isSpaceChar(cArr[i]) || cArr[i] == 10)) {
                i++;
            }
        } else {
            i = 0;
        }
        int i4 = length - 1;
        if (Character.isSpaceChar(cArr[i4]) || cArr[i4] == 10) {
            i2 = length;
            while (i2 > 1) {
                int i5 = i2 - 1;
                if (!Character.isSpaceChar(cArr[i5]) && cArr[i5] != 10) {
                    break;
                }
                i2--;
            }
        } else {
            i2 = length;
        }
        if (i == 0 && i2 == length) {
            return spannableString;
        }
        SpannableString spannableString2 = (SpannableString) spannableString.subSequence(i, i2);
        Object[] spans = spannableString2.getSpans(0, spannableString2.length(), Object.class);
        while (i3 < spans.length) {
            int i6 = i3 + 1;
            try {
                Object obj = spans[i3];
                if (obj != null) {
                    int spanStart = spannableString2.getSpanStart(obj);
                    int spanEnd = spannableString2.getSpanEnd(obj);
                    if (spanStart == -1 || spanStart > spannableString2.length()) {
                        spannableString2.removeSpan(obj);
                    } else if (spanEnd == -1 || spanEnd > spannableString2.length()) {
                        spannableString2.removeSpan(obj);
                    }
                }
                i3 = i6;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        return spannableString2;
    }
}
