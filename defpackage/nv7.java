package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: nv7  reason: default package */
public final class nv7 extends x1 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public nv7(List list) {
        this.b = list;
    }

    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    public final Object get(int i) {
        switch (this.a) {
            case 0:
                String group = ((Matcher) ((mn) this.b).b).group(i);
                return group == null ? BuildConfig.FLAVOR : group;
            default:
                return ((List) this.b).get(o23.P(i, this));
        }
    }

    public final int getSize() {
        switch (this.a) {
            case 0:
                return ((Matcher) ((mn) this.b).b).groupCount() + 1;
            default:
                return ((List) this.b).size();
        }
    }

    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new zcc(this, 0);
            default:
                return super.iterator();
        }
    }

    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new zcc(this, 0);
            default:
                return super.listIterator();
        }
    }

    public nv7(mn mnVar) {
        this.b = mnVar;
    }

    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new zcc(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
