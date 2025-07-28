package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: q07  reason: default package */
public final class q07 {
    public static final String[] o = {"UPDATE", "DELETE", "INSERT"};
    public final aec a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g;
    public volatile yz5 h;
    public final e06 i;
    public final nu7 j;
    public final ijc k;
    public final Object l;
    public final Object m;
    public final vp6 n;

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r6v3, types: [nu7, java.lang.Object] */
    public q07(aec aec, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = aec;
        this.b = hashMap;
        this.c = hashMap2;
        int length = strArr.length;
        ? obj = new Object();
        obj.b = new long[length];
        obj.c = new boolean[length];
        obj.o = new int[length];
        this.i = obj;
        ? obj2 = new Object();
        obj2.a = aec;
        obj2.b = Collections.newSetFromMap(new IdentityHashMap());
        this.j = obj2;
        this.k = new ijc();
        this.l = new Object();
        this.m = new Object();
        this.d = new LinkedHashMap();
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.d.put(lowerCase, Integer.valueOf(i2));
            String str2 = (String) this.b.get(strArr[i2]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i2] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase4, ju7.Q(linkedHashMap, lowerCase3));
            }
        }
        this.n = new vp6(1, this);
    }

    public final void a(n07 n07) {
        o07 o07;
        boolean z;
        String[] d2 = d(n07.a);
        ArrayList arrayList = new ArrayList(d2.length);
        int length = d2.length;
        int i2 = 0;
        while (i2 < length) {
            String str = d2[i2];
            Integer num = (Integer) this.d.get(str.toLowerCase(Locale.US));
            if (num != null) {
                arrayList.add(num);
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        int[] r0 = o23.r0(arrayList);
        o07 o072 = new o07(n07, r0, d2);
        synchronized (this.k) {
            o07 = (o07) this.k.b(n07, o072);
        }
        if (o07 == null) {
            e06 e06 = this.i;
            int[] copyOf = Arrays.copyOf(r0, r0.length);
            synchronized (e06) {
                z = false;
                for (int i3 : copyOf) {
                    long[] jArr = (long[]) e06.b;
                    long j2 = jArr[i3];
                    jArr[i3] = 1 + j2;
                    if (j2 == 0) {
                        z = true;
                        e06.a = true;
                    }
                }
            }
            if (z) {
                aec aec = this.a;
                if (aec.n()) {
                    f(aec.h().getWritableDatabase());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.a.n()) {
            return false;
        }
        if (!this.g) {
            this.a.h().getWritableDatabase();
        }
        return this.g;
    }

    public final void c(n07 n07) {
        o07 o07;
        boolean z;
        synchronized (this.k) {
            o07 = (o07) this.k.c(n07);
        }
        if (o07 != null) {
            e06 e06 = this.i;
            int[] iArr = o07.b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            synchronized (e06) {
                z = false;
                for (int i2 : copyOf) {
                    long[] jArr = (long[]) e06.b;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        z = true;
                        e06.a = true;
                    }
                }
            }
            if (z) {
                aec aec = this.a;
                if (aec.n()) {
                    f(aec.h().getWritableDatabase());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        u3d u3d = new u3d();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            Map map = this.c;
            if (map.containsKey(lowerCase)) {
                u3d.addAll((Collection) map.get(str.toLowerCase(locale)));
            } else {
                u3d.add(str);
            }
        }
        return (String[]) z3d.h(u3d).toArray(new String[0]);
    }

    public final void e(sz5 sz5, int i2) {
        sz5.U("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.e[i2];
        String[] strArr = o;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i2);
            sb.append(" AND invalidated = 0; END");
            sz5.U(sb.toString());
        }
    }

    public final void f(sz5 sz5) {
        ReentrantReadWriteLock.ReadLock readLock;
        if (!sz5.m0()) {
            try {
                readLock = this.a.i.readLock();
                readLock.lock();
                synchronized (this.l) {
                    int[] i2 = this.i.i();
                    if (i2 == null) {
                        readLock.unlock();
                        return;
                    }
                    if (sz5.n0()) {
                        sz5.n();
                    } else {
                        sz5.m();
                    }
                    try {
                        int length = i2.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i2[i3];
                            int i6 = i4 + 1;
                            if (i5 == 1) {
                                e(sz5, i4);
                            } else if (i5 == 2) {
                                String str = this.e[i4];
                                String[] strArr = o;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = strArr[i7];
                                    StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                    sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                    sz5.U(sb.toString());
                                }
                            }
                            i3++;
                            i4 = i6;
                        }
                        sz5.r0();
                        sz5.S();
                        readLock.unlock();
                    } finally {
                        sz5.S();
                    }
                }
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        }
    }
}
