package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: y3e  reason: default package */
public final class y3e implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ y3e() {
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                Method method = (Method) this.c;
                try {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls = Boolean.TYPE;
                    Object obj = this.b;
                    if (returnType == cls) {
                        return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
                    }
                    method.invoke(obj, new Object[]{menuItem});
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((yl8) this.c).M(menuItem));
        }
    }

    public y3e(yl8 yl8, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = yl8;
        this.b = onMenuItemClickListener;
    }
}
