package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: end  reason: default package */
public final class end implements Iterator {
    public final boolean X;
    public int Y = 0;
    public int Z;
    public int a = 2;
    public String b;
    public final CharSequence c;
    public final w12 o;
    public final /* synthetic */ u5g w0;

    public end(u5g u5g, jn jnVar, CharSequence charSequence) {
        this.w0 = u5g;
        this.o = (w12) jnVar.c;
        this.X = false;
        this.Z = jnVar.b;
        this.c = charSequence;
    }

    public final boolean hasNext() {
        String str;
        CharSequence charSequence;
        int i;
        int i2 = this.a;
        if (i2 != 4) {
            int t = hr1.t(i2);
            if (t == 0) {
                return true;
            }
            if (t == 2) {
                return false;
            }
            this.a = 4;
            int i3 = this.Y;
            while (true) {
                int i4 = this.Y;
                if (i4 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                charSequence = this.c;
                int a2 = ((w12) this.w0.b).a(i4, charSequence);
                if (a2 == -1) {
                    a2 = charSequence.length();
                    this.Y = -1;
                } else {
                    this.Y = a2 + 1;
                }
                int i5 = this.Y;
                if (i5 == i3) {
                    int i6 = i5 + 1;
                    this.Y = i6;
                    if (i6 > charSequence.length()) {
                        this.Y = -1;
                    }
                } else {
                    while (true) {
                        w12 w12 = this.o;
                        if (i3 < a2 && w12.b(charSequence.charAt(i3))) {
                            i3++;
                        }
                    }
                    while (i > i3 && w12.b(charSequence.charAt(i - 1))) {
                        a2 = i - 1;
                    }
                    if (!this.X || i3 != i) {
                        int i7 = this.Z;
                    } else {
                        i3 = this.Y;
                    }
                }
            }
            int i72 = this.Z;
            if (i72 == 1) {
                i = charSequence.length();
                this.Y = -1;
                while (i > i3 && w12.b(charSequence.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.Z = i72 - 1;
            }
            str = charSequence.subSequence(i3, i).toString();
            this.b = str;
            if (this.a == 3) {
                return false;
            }
            this.a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            String str = this.b;
            this.b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
