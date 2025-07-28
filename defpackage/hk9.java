package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: hk9  reason: default package */
public final class hk9 implements j26, of3, swe, y03, m06, Provider, s1e, gu3 {
    public static final hk9 X = new hk9(3);
    public static final hk9 Y = new hk9(4);
    public static final hk9 Z = new hk9(5);
    public static hk9 b;
    public static final hk9 c = new hk9(1);
    public static final hk9 o = new hk9(2);
    public final /* synthetic */ int a;

    public /* synthetic */ hk9(int i) {
        this.a = i;
    }

    public static hk9 f(Context context, int i) {
        e07.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, xvb.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(xvb.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(xvb.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(xvb.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(xvb.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList i2 = wx3.i(context, obtainStyledAttributes, xvb.MaterialCalendarItem_itemFillColor);
        ColorStateList i3 = wx3.i(context, obtainStyledAttributes, xvb.MaterialCalendarItem_itemTextColor);
        ColorStateList i4 = wx3.i(context, obtainStyledAttributes, xvb.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(xvb.MaterialCalendarItem_itemStrokeWidth, 0);
        ead c2 = ead.a(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(xvb.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new a0((float) 0)).c();
        obtainStyledAttributes.recycle();
        return new hk9(i2, i3, i4, dimensionPixelSize, c2, rect);
    }

    public static Path i(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public void a() {
    }

    public void accept(Object obj) {
        int i = v2c.g;
        udd.s("v2c", "Can't add to recents", (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                List<pa1> list = (List) obj;
                ArrayList arrayList = new ArrayList(q23.H(list, 10));
                for (pa1 pa1 : list) {
                    arrayList.add(new oa1(pa1.c, pa1.a, pa1.b));
                }
                return arrayList;
            default:
                return ((OneMeRoomDatabase) obj).z();
        }
    }

    public boolean b(xu5 xu5) {
        return false;
    }

    public void c(String str) {
    }

    public void close() {
    }

    public u1e d(xu5 xu5) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public int e(xu5 xu5) {
        return 1;
    }

    public HashMap g(Object obj) {
        ConcurrentHashMap concurrentHashMap = ek.a;
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) ek.a.get(cls);
        HashMap hashMap2 = map;
        if (map == null) {
            HashMap hashMap3 = new HashMap();
            ek.a(cls, hashMap3, new HashMap());
            hashMap2 = hashMap3;
        }
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put(entry.getKey(), new x05(obj, (Method) entry.getValue()));
            }
        }
        return hashMap;
    }

    public Object get() {
        return Integer.valueOf(fnc.o);
    }

    public HashMap h(Object obj) {
        ConcurrentHashMap concurrentHashMap = ek.a;
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) ek.b.get(cls);
        HashMap hashMap2 = map;
        if (map == null) {
            HashMap hashMap3 = new HashMap();
            ek.a(cls, new HashMap(), hashMap3);
            hashMap2 = hashMap3;
        }
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                HashSet hashSet = new HashSet();
                for (Method m05 : (Set) entry.getValue()) {
                    hashSet.add(new m05(obj, m05));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [ch7, k1, java.lang.Object] */
    public ch7 j(kc8 kc8, ic8 ic8, List list) {
        ArrayList<l68> arrayList = new ArrayList<>(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l68 l68 = (l68) it.next();
            a68 a68 = l68.b;
            if (a68 != null) {
                q58 a2 = l68.a();
                a2.g = kjd.K(a68.a, l68).toString();
                l68 = a2.a();
            }
            arrayList.add(l68);
        }
        for (l68 l682 : arrayList) {
            if (l682.b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ? obj = new Object();
                obj.m(unsupportedOperationException);
                return obj;
            }
        }
        return swb.A(arrayList);
    }

    public hk9(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ead ead, Rect rect) {
        this.a = 7;
        e07.m(rect.left);
        e07.m(rect.top);
        e07.m(rect.right);
        e07.m(rect.bottom);
    }
}
