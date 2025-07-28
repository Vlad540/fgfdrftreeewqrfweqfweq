package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a4e  reason: default package */
public final class a4e extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public a4e(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        z3e z3e = new z3e(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z2 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        } else if (name2.equals("group")) {
                            z3e.b = 0;
                            z3e.c = 0;
                            z3e.d = 0;
                            z3e.e = 0;
                            z3e.f = true;
                            z3e.g = true;
                        } else if (name2.equals("item")) {
                            if (!z3e.h) {
                                o7 o7Var = z3e.z;
                                if (o7Var == null || !o7Var.a()) {
                                    z3e.h = true;
                                    z3e.b(z3e.a.add(z3e.b, z3e.i, z3e.j, z3e.k));
                                } else {
                                    z3e.h = true;
                                    z3e.b(z3e.a.addSubMenu(z3e.b, z3e.i, z3e.j, z3e.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z = true;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    a4e a4e = z3e.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = a4e.c.obtainStyledAttributes(attributeSet2, nwb.MenuGroup);
                        z3e.b = obtainStyledAttributes.getResourceId(nwb.MenuGroup_android_id, 0);
                        z3e.c = obtainStyledAttributes.getInt(nwb.MenuGroup_android_menuCategory, 0);
                        z3e.d = obtainStyledAttributes.getInt(nwb.MenuGroup_android_orderInCategory, 0);
                        z3e.e = obtainStyledAttributes.getInt(nwb.MenuGroup_android_checkableBehavior, 0);
                        z3e.f = obtainStyledAttributes.getBoolean(nwb.MenuGroup_android_visible, true);
                        z3e.g = obtainStyledAttributes.getBoolean(nwb.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = a4e.c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, nwb.MenuItem);
                        z3e.i = obtainStyledAttributes2.getResourceId(nwb.MenuItem_android_id, 0);
                        z3e.j = (obtainStyledAttributes2.getInt(nwb.MenuItem_android_orderInCategory, z3e.d) & 65535) | (obtainStyledAttributes2.getInt(nwb.MenuItem_android_menuCategory, z3e.c) & -65536);
                        z3e.k = obtainStyledAttributes2.getText(nwb.MenuItem_android_title);
                        z3e.l = obtainStyledAttributes2.getText(nwb.MenuItem_android_titleCondensed);
                        z3e.m = obtainStyledAttributes2.getResourceId(nwb.MenuItem_android_icon, 0);
                        String string = obtainStyledAttributes2.getString(nwb.MenuItem_android_alphabeticShortcut);
                        z3e.n = string == null ? 0 : string.charAt(0);
                        z3e.o = obtainStyledAttributes2.getInt(nwb.MenuItem_alphabeticModifiers, 4096);
                        String string2 = obtainStyledAttributes2.getString(nwb.MenuItem_android_numericShortcut);
                        z3e.p = string2 == null ? 0 : string2.charAt(0);
                        z3e.q = obtainStyledAttributes2.getInt(nwb.MenuItem_numericModifiers, 4096);
                        if (obtainStyledAttributes2.hasValue(nwb.MenuItem_android_checkable)) {
                            z3e.r = obtainStyledAttributes2.getBoolean(nwb.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            z3e.r = z3e.e;
                        }
                        z3e.s = obtainStyledAttributes2.getBoolean(nwb.MenuItem_android_checked, false);
                        z3e.t = obtainStyledAttributes2.getBoolean(nwb.MenuItem_android_visible, z3e.f);
                        z3e.u = obtainStyledAttributes2.getBoolean(nwb.MenuItem_android_enabled, z3e.g);
                        z3e.v = obtainStyledAttributes2.getInt(nwb.MenuItem_showAsAction, -1);
                        z3e.y = obtainStyledAttributes2.getString(nwb.MenuItem_android_onClick);
                        z3e.w = obtainStyledAttributes2.getResourceId(nwb.MenuItem_actionLayout, 0);
                        z3e.x = obtainStyledAttributes2.getString(nwb.MenuItem_actionViewClass);
                        String string3 = obtainStyledAttributes2.getString(nwb.MenuItem_actionProviderClass);
                        if (string3 != null && z3e.w == 0 && z3e.x == null) {
                            z3e.z = (o7) z3e.a(string3, f, a4e.b);
                        } else {
                            z3e.z = null;
                        }
                        z3e.A = obtainStyledAttributes2.getText(nwb.MenuItem_contentDescription);
                        z3e.B = obtainStyledAttributes2.getText(nwb.MenuItem_tooltipText);
                        if (obtainStyledAttributes2.hasValue(nwb.MenuItem_iconTintMode)) {
                            z3e.D = bn4.c(obtainStyledAttributes2.getInt(nwb.MenuItem_iconTintMode, -1), z3e.D);
                        } else {
                            z3e.D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(nwb.MenuItem_iconTint)) {
                            int i2 = nwb.MenuItem_iconTint;
                            if (!obtainStyledAttributes2.hasValue(i2) || (resourceId = obtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = d8.r(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(i2);
                            }
                            z3e.C = colorStateList;
                        } else {
                            z3e.C = null;
                        }
                        obtainStyledAttributes2.recycle();
                        z3e.h = false;
                    } else {
                        if (name3.equals("menu")) {
                            z3e.h = true;
                            SubMenu addSubMenu = z3e.a.addSubMenu(z3e.b, z3e.i, z3e.j, z3e.k);
                            z3e.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof pl8)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            XmlResourceParser layout = this.c.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof pl8) {
                pl8 pl8 = (pl8) menu;
                if (!pl8.E0) {
                    pl8.w();
                    z = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z) {
                ((pl8) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (0 != 0) {
                ((pl8) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
