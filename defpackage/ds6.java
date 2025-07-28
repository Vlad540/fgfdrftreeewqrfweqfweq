package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ds6  reason: default package */
public final class ds6 implements Iterator {
    public final /* synthetic */ int a;
    public final uze[] b;
    public int c = 0;

    public /* synthetic */ ds6(uze[] uzeArr, int i) {
        this.a = i;
        this.b = uzeArr;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c != this.b.length;
            default:
                return this.c < this.b.length;
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.c;
                uze[] uzeArr = this.b;
                if (i < uzeArr.length) {
                    this.c = i + 1;
                    return uzeArr[i];
                }
                throw new NoSuchElementException();
            default:
                int i2 = this.c;
                uze[] uzeArr2 = this.b;
                if (i2 < uzeArr2.length) {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(uzeArr2[i2], uzeArr2[i2 + 1]);
                    this.c += 2;
                    return simpleImmutableEntry;
                }
                throw new NoSuchElementException();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
