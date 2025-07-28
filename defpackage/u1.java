package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u1  reason: default package */
public class u1 implements Iterator, z67 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ u1(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < ((x1) this.c).getSize();
            case 1:
                return this.b < ((float[]) this.c).length;
            case 2:
                return this.b < ((Object[]) this.c).length;
            case 3:
                return this.b < ((Menu) this.c).size();
            default:
                return this.b < ((ViewGroup) this.c).getChildCount();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                if (hasNext()) {
                    int i = this.b;
                    this.b = i + 1;
                    return ((x1) this.c).get(i);
                }
                throw new NoSuchElementException();
            case 1:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return Float.valueOf(((float[]) this.c)[i2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) this.c)[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 3:
                int i4 = this.b;
                this.b = i4 + 1;
                MenuItem item = ((Menu) this.c).getItem(i4);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            default:
                int i5 = this.b;
                this.b = i5 + 1;
                View childAt = ((ViewGroup) this.c).getChildAt(i5);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    public final void remove() {
        jue jue;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i = this.b - 1;
                this.b = i;
                Menu menu = (Menu) this.c;
                MenuItem item = menu.getItem(i);
                if (item != null) {
                    menu.removeItem(item.getItemId());
                    jue = jue.a;
                } else {
                    jue = null;
                }
                if (jue == null) {
                    throw new IndexOutOfBoundsException();
                }
                return;
            default:
                int i2 = this.b - 1;
                this.b = i2;
                ((ViewGroup) this.c).removeViewAt(i2);
                return;
        }
    }
}
