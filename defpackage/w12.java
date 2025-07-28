package defpackage;

/* renamed from: w12  reason: default package */
public abstract class w12 implements u1b {
    public int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        a06.n(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
