package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ue5  reason: default package */
public final class ue5 implements SharedPreferences {
    public static final Object h = new Object();
    public final ve5 a;
    public final e3 b;
    public final dy c;
    public jc9 d;
    public final r7e e;
    public final t97 f;
    public final Object g;

    public ue5(File file, ve5 ve5, we5 we5, e3 e3Var) {
        this.a = ve5;
        this.b = e3Var;
        File file2 = new File(file, h0e.l0(ve5.a, ".prefs").concat(".prefs"));
        dy dyVar = new dy(file2, e3Var != null ? new r34(24, (Object) this) : null);
        this.c = dyVar;
        this.d = new jc9(10);
        this.e = new r7e(new zu4(this, 8, we5));
        this.f = ez3.O(2, new xd3(29));
        this.g = new Object();
        if (file2.exists()) {
            if (e3Var != null) {
                try {
                    e3Var.e("read prefs from file");
                } catch (Throwable th) {
                    e3 e3Var2 = this.b;
                    if (e3Var2 != null) {
                        udd.s(((f3) e3Var2.a).e, "read prefs from file failure", th);
                        return;
                    }
                    return;
                }
            }
            h2g.w(dyVar, new bk(9, this));
        }
    }

    public final void a(kc9 kc9, boolean z, ec9 ec9) {
        kc9 kc92 = kc9;
        ec9 ec92 = ec9;
        if (kc92.d != 0) {
            if (ec92.b == 0 && !z) {
                return;
            }
            if (!hhd.f(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new se5(0, this, kc9, ec9, z));
                return;
            }
            char c2 = 7;
            long j = -9187201950435737472L;
            if (z) {
                Object[] objArr = kc92.b;
                long[] jArr = kc92.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & j) != j) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j2 & 255) < 128) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) objArr[(i << 3) + i3]).onSharedPreferenceChanged(this, (String) null);
                                }
                                j2 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        j = -9187201950435737472L;
                    }
                }
            }
            Object[] objArr2 = ec92.a;
            int i4 = ec92.b - 1;
            while (-1 < i4) {
                String str = (String) objArr2[i4];
                Object[] objArr3 = kc92.b;
                long[] jArr2 = kc92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j3 = jArr2[i5];
                        if ((((~j3) << c2) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j3 & 255) < 128) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) objArr3[(i5 << 3) + i7]).onSharedPreferenceChanged(this, str);
                                }
                                j3 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                        c2 = 7;
                    }
                }
                i4--;
                c2 = 7;
            }
        }
    }

    public final boolean contains(String str) {
        return this.d.b(str);
    }

    public final SharedPreferences.Editor edit() {
        ve5 ve5 = this.a;
        e3 e3Var = this.b;
        if (e3Var != null) {
            ve5.getClass();
            e3Var.e("edit: strategy = ".concat("BIG_CHANGES"));
        }
        ve5.getClass();
        return new te5(this);
    }

    public final Map getAll() {
        HashMap hashMap = new HashMap(this.d.e);
        jc9 jc9 = this.d;
        Object[] objArr = jc9.b;
        Object[] objArr2 = jc9.c;
        long[] jArr = jc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            hashMap.put((String) objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        Object f2 = this.d.f(str);
        Boolean bool = f2 instanceof Boolean ? (Boolean) f2 : null;
        return bool != null ? bool.booleanValue() : z;
    }

    public final float getFloat(String str, float f2) {
        Object f3 = this.d.f(str);
        Float f4 = f3 instanceof Float ? (Float) f3 : null;
        return f4 != null ? f4.floatValue() : f2;
    }

    public final int getInt(String str, int i) {
        Object f2 = this.d.f(str);
        Integer num = f2 instanceof Integer ? (Integer) f2 : null;
        return num != null ? num.intValue() : i;
    }

    public final long getLong(String str, long j) {
        Object f2 = this.d.f(str);
        Long l = f2 instanceof Long ? (Long) f2 : null;
        return l != null ? l.longValue() : j;
    }

    public final String getString(String str, String str2) {
        Object f2 = this.d.f(str);
        String str3 = f2 instanceof String ? (String) f2 : null;
        return str3 == null ? str2 : str3;
    }

    public final Set getStringSet(String str, Set set) {
        Object f2 = this.d.f(str);
        Set set2 = f2 instanceof Set ? (Set) f2 : null;
        return set2 == null ? set : set2;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).put(onSharedPreferenceChangeListener, h);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).remove(onSharedPreferenceChangeListener);
        }
    }
}
