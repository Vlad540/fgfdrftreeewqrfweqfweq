package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: z3e  reason: default package */
public final class z3e {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ a4e E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public o7 z;

    public z3e(a4e a4e, Menu menu) {
        this.E = a4e;
        this.a = menu;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.y;
        a4e a4e = this.E;
        if (str != null) {
            if (!a4e.c.isRestricted()) {
                if (a4e.d == null) {
                    a4e.d = a4e.a(a4e.c);
                }
                Object obj = a4e.d;
                String str2 = this.y;
                y3e y3e = new y3e();
                y3e.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    y3e.c = cls.getMethod(str2, y3e.d);
                    menuItem.setOnMenuItemClickListener(y3e);
                } catch (Exception e2) {
                    StringBuilder m2 = hr1.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    m2.append(cls.getName());
                    InflateException inflateException = new InflateException(m2.toString());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof ul8) {
                ul8 ul8 = (ul8) menuItem;
                ul8.M0 = (ul8.M0 & -5) | 4;
            } else if (menuItem instanceof yl8) {
                yl8 yl8 = (yl8) menuItem;
                try {
                    Method method = yl8.X;
                    b4e b4e = yl8.o;
                    if (method == null) {
                        yl8.X = b4e.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    yl8.X.invoke(b4e, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, a4e.e, a4e.a));
            z2 = true;
        }
        int i3 = this.w;
        if (i3 > 0 && !z2) {
            menuItem.setActionView(i3);
        }
        o7 o7Var = this.z;
        if (o7Var != null && (menuItem instanceof b4e)) {
            ((b4e) menuItem).a(o7Var);
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof b4e;
        if (z3) {
            ((b4e) menuItem).setContentDescription(charSequence);
        } else {
            sl8.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((b4e) menuItem).setTooltipText(charSequence2);
        } else {
            sl8.m(menuItem, charSequence2);
        }
        char c2 = this.n;
        int i4 = this.o;
        if (z3) {
            ((b4e) menuItem).setAlphabeticShortcut(c2, i4);
        } else {
            sl8.g(menuItem, c2, i4);
        }
        char c3 = this.p;
        int i5 = this.q;
        if (z3) {
            ((b4e) menuItem).setNumericShortcut(c3, i5);
        } else {
            sl8.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((b4e) menuItem).setIconTintMode(mode);
            } else {
                sl8.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList == null) {
            return;
        }
        if (z3) {
            ((b4e) menuItem).setIconTintList(colorStateList);
        } else {
            sl8.i(menuItem, colorStateList);
        }
    }
}
