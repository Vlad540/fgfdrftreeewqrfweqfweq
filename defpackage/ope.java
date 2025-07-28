package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.opengl.GLES20;
import android.util.Pair;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ope  reason: default package */
public class ope implements s3e, m96, jtc, ktc {
    public Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;

    public /* synthetic */ ope(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.X = obj2;
        this.Y = bArr;
        this.c = objArr;
        this.b = i;
    }

    public static void s(String str) {
        if (!p0e.M(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = hhd.o(str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }
    }

    public static /* synthetic */ void v(ope ope, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = ope.b;
        }
        if ((i2 & 4) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        ope.u(i, str, str2);
        throw null;
    }

    public int A(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((u41) this.o).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            xw2 xw2 = (xw2) this.X;
            int Q = i - (i2 - xw2.Q(i2));
            if (Q == 0) {
                while (xw2.S(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += Q;
        }
        return -1;
    }

    public String B(String str) {
        HashMap hashMap = (HashMap) this.X;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = ((ArrayList) this.Y).iterator();
            while (true) {
                if (it.hasNext()) {
                    fu1 f = ((fu1) it.next()).f();
                    e07.j("CameraInfo doesn't contain Camera2 implementation.", f instanceof or1);
                    if (str2.equals(((or1) ((or1) f).c.b).a)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public View C(int i) {
        return ((u41) this.o).a.getChildAt(i);
    }

    public int D() {
        return ((u41) this.o).a.getChildCount();
    }

    public void E(View view) {
        ((ArrayList) this.Y).add(view);
        u41 u41 = (u41) this.o;
        u41.getClass();
        b7c U = RecyclerView.U(view);
        if (U != null) {
            int i = U.F0;
            View view2 = U.a;
            if (i != -1) {
                U.E0 = i;
            } else {
                WeakHashMap weakHashMap = eaf.a;
                U.E0 = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = u41.a;
            if (recyclerView.Z()) {
                U.F0 = 4;
                recyclerView.J1.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = eaf.a;
            view2.setImportantForAccessibility(4);
        }
    }

    public boolean F(ope ope, int i) {
        return ope != null && mze.a(((i9c[]) this.o)[i], ((i9c[]) ope.o)[i]) && mze.a(((f55[]) this.X)[i], ((f55[]) ope.X)[i]);
    }

    public boolean G(ope ope, int i) {
        return ope != null && oze.a(((j9c[]) this.o)[i], ((j9c[]) ope.o)[i]) && oze.a(((g55[]) this.X)[i], ((g55[]) ope.X)[i]);
    }

    public boolean H(View view) {
        return ((ArrayList) this.Y).contains(view);
    }

    public boolean I(int i) {
        switch (this.a) {
            case 0:
                return ((i9c[]) this.o)[i] != null;
            default:
                return ((j9c[]) this.o)[i] != null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        defpackage.urd.l(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J(defpackage.sz5 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r4.q0(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0017
            r2 = 1
            goto L_0x0017
        L_0x0015:
            r3 = move-exception
            goto L_0x004a
        L_0x0017:
            r1 = 0
            defpackage.urd.l(r0, r1)
            java.lang.Object r0 = r3.X
            rx r0 = (defpackage.rx) r0
            r0.b(r4)
            if (r2 != 0) goto L_0x0043
            ns8 r1 = r0.r(r4)
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r4.<init>(r0)
            java.lang.String r0 = r1.c
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0043:
            r3.Y(r4)
            r0.n()
            return
        L_0x004a:
            throw r3     // Catch:{ all -> 0x004b }
        L_0x004b:
            r4 = move-exception
            defpackage.urd.l(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.J(sz5):void");
    }

    public void K(sz5 sz5, int i, int i2) {
        M(sz5, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        defpackage.urd.l(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        defpackage.urd.l(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(defpackage.sz5 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.q0(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0015:
            r5 = move-exception
            goto L_0x008f
        L_0x0018:
            r1 = r2
        L_0x0019:
            r3 = 0
            defpackage.urd.l(r0, r3)
            java.lang.Object r0 = r5.X
            rx r0 = (defpackage.rx) r0
            if (r1 == 0) goto L_0x0068
            ygd r1 = new ygd
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.o0(r1)
            boolean r4 = r1.moveToFirst()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x003b
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0039 }
            goto L_0x003c
        L_0x0039:
            r5 = move-exception
            goto L_0x0062
        L_0x003b:
            r2 = r3
        L_0x003c:
            defpackage.urd.l(r1, r3)
            java.lang.Object r1 = r5.Y
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = defpackage.hhd.f(r1, r2)
            if (r4 != 0) goto L_0x0073
            java.lang.Object r4 = r5.c
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.hhd.f(r4, r2)
            if (r4 == 0) goto L_0x0054
            goto L_0x0073
        L_0x0054:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r0 = ", found: "
            java.lang.String r6 = me4.j(r6, r1, r0, r2)
            r5.<init>(r6)
            throw r5
        L_0x0062:
            throw r5     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r6 = move-exception
            defpackage.urd.l(r1, r5)
            throw r6
        L_0x0068:
            ns8 r1 = r0.r(r6)
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x0079
            r5.Y(r6)
        L_0x0073:
            r0.o(r6)
            r5.o = r3
            return
        L_0x0079:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r6.<init>(r0)
            java.lang.String r0 = r1.c
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x008f:
            throw r5     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r6 = move-exception
            defpackage.urd.l(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.L(sz5):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r9.add(r11.get(r14));
        r10 = r14.intValue();
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0081, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(defpackage.sz5 r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Object r4 = r0.o
            b04 r4 = (defpackage.b04) r4
            java.lang.Object r5 = r0.X
            rx r5 = (defpackage.rx) r5
            if (r4 == 0) goto L_0x00c0
            mv4 r4 = r4.d
            r4.getClass()
            if (r2 != r3) goto L_0x001d
            hw4 r4 = defpackage.hw4.a
            goto L_0x0085
        L_0x001d:
            r7 = 0
            if (r3 <= r2) goto L_0x0022
            r8 = 1
            goto L_0x0023
        L_0x0022:
            r8 = r7
        L_0x0023:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = r2
        L_0x0029:
            if (r8 == 0) goto L_0x002e
            if (r10 >= r3) goto L_0x0084
            goto L_0x0030
        L_0x002e:
            if (r10 <= r3) goto L_0x0084
        L_0x0030:
            java.lang.Object r11 = r4.b
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r11.get(r12)
            java.util.TreeMap r11 = (java.util.TreeMap) r11
            r12 = 0
            if (r11 != 0) goto L_0x0043
        L_0x0041:
            r4 = r12
            goto L_0x0085
        L_0x0043:
            if (r8 == 0) goto L_0x004a
            java.util.NavigableSet r13 = r11.descendingKeySet()
            goto L_0x004e
        L_0x004a:
            java.util.Set r13 = r11.keySet()
        L_0x004e:
            java.util.Iterator r13 = r13.iterator()
        L_0x0052:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0080
            java.lang.Object r14 = r13.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r8 == 0) goto L_0x006b
            int r15 = r10 + 1
            int r6 = r14.intValue()
            if (r15 > r6) goto L_0x0052
            if (r6 > r3) goto L_0x0052
            goto L_0x0073
        L_0x006b:
            int r6 = r14.intValue()
            if (r3 > r6) goto L_0x0052
            if (r6 >= r10) goto L_0x0052
        L_0x0073:
            java.lang.Object r6 = r11.get(r14)
            r9.add(r6)
            int r10 = r14.intValue()
            r6 = 1
            goto L_0x0081
        L_0x0080:
            r6 = r7
        L_0x0081:
            if (r6 != 0) goto L_0x0029
            goto L_0x0041
        L_0x0084:
            r4 = r9
        L_0x0085:
            if (r4 == 0) goto L_0x00c0
            r5.p(r1)
            java.util.Iterator r2 = r4.iterator()
        L_0x008e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r2.next()
            x39 r3 = (defpackage.x39) r3
            r3.a(r1)
            goto L_0x008e
        L_0x009e:
            ns8 r2 = r5.r(r1)
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x00aa
            r16.Y(r17)
            goto L_0x00d2
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Migration didn't properly handle: "
            r1.<init>(r3)
            java.lang.String r2 = r2.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            java.lang.Object r0 = r0.o
            b04 r0 = (defpackage.b04) r0
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r0.a(r2, r3)
            if (r0 != 0) goto L_0x00d3
            r5.c(r1)
            r5.b(r1)
        L_0x00d2:
            return
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "A migration from "
            java.lang.String r4 = " to "
            java.lang.String r5 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r1 = rf0.g(r1, r2, r4, r3, r5)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.M(sz5, int, int):void");
    }

    public byte N() {
        int i = this.b;
        while (true) {
            int P = P(i);
            if (P != -1) {
                char charAt = ((String) this.c).charAt(P);
                if (charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ') {
                    i = P + 1;
                } else {
                    this.b = P;
                    return xie.j(charAt);
                }
            } else {
                this.b = P;
                return 10;
            }
        }
    }

    public String O(boolean z) {
        String str;
        byte N = N();
        if (z) {
            if (N != 1 && N != 0) {
                return null;
            }
            str = q();
        } else if (N != 1) {
            return null;
        } else {
            str = o();
        }
        this.X = str;
        return str;
    }

    public int P(int i) {
        if (i < ((String) this.c).length()) {
            return i;
        }
        return -1;
    }

    public synchronized void Q(p96 p96, long j) {
        try {
            if (this.b > 0) {
                ((ew0) this.Y).v(new qy5(this, p96, j));
                this.b--;
            } else {
                ((ArrayDeque) this.c).add(Pair.create(p96, Long.valueOf(j)));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void R(int i) {
        u41 u41 = (u41) this.o;
        int i2 = this.b;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i2 != 2) {
            try {
                int A = A(i);
                View childAt = u41.a.getChildAt(A);
                if (childAt == null) {
                    this.b = 0;
                    this.c = null;
                    return;
                }
                this.b = 1;
                this.c = childAt;
                if (((xw2) this.X).Z(A)) {
                    X(childAt);
                }
                u41.a(A);
                this.b = 0;
                this.c = null;
            } catch (Throwable th) {
                this.b = 0;
                this.c = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public synchronized void S() {
        try {
            if (!((ArrayDeque) this.c).isEmpty()) {
                ((ArrayDeque) this.c).add(Pair.create(p96.e, Long.MIN_VALUE));
            } else {
                o96 o96 = (o96) this.X;
                Objects.requireNonNull(o96);
                ((ew0) this.Y).v(new ny1(o96, 1));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public int T() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.c;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.b = i;
            } else {
                i++;
            }
        }
        this.b = i;
        return i;
    }

    public boolean U() {
        int T = T();
        String str = (String) this.c;
        if (T >= str.length() || T == -1 || str.charAt(T) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean V(boolean z) {
        int P = P(T());
        String str = (String) this.c;
        int length = str.length() - P;
        if (length < 4 || P == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != str.charAt(P + i)) {
                return false;
            }
        }
        if (length > 4 && xie.j(str.charAt(P + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.b = P + 4;
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void W(char c2) {
        int i = this.b;
        if (i > 0 && c2 == '\"') {
            try {
                this.b = i - 1;
                String q = q();
                this.b = i;
                if (hhd.f(q, "null")) {
                    u(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        w(xie.j(c2), true);
        throw null;
    }

    public void X(View view) {
        if (((ArrayList) this.Y).remove(view)) {
            u41 u41 = (u41) this.o;
            u41.getClass();
            b7c U = RecyclerView.U(view);
            if (U != null) {
                int i = U.E0;
                RecyclerView recyclerView = u41.a;
                if (recyclerView.Z()) {
                    U.F0 = i;
                    recyclerView.J1.add(U);
                } else {
                    WeakHashMap weakHashMap = eaf.a;
                    U.a.setImportantForAccessibility(i);
                }
                U.E0 = 0;
            }
        }
    }

    public void Y(sz5 sz5) {
        sz5.U("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sz5.U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.Y) + "')");
    }

    public void Z(int i) {
        int[] iArr = (int[]) this.Y;
        if (iArr[i] == 0) {
            iArr[i] = 1;
            for (vb6 vb6 : ((vb6[][]) this.X)[i]) {
                Z(vb6.a.b);
                int i2 = this.b;
                this.b = i2 - 1;
                ((vb6[]) this.o)[i2] = vb6;
            }
            iArr[i] = 2;
        }
    }

    public void a(int i, View view, boolean z) {
        u41 u41 = (u41) this.o;
        int childCount = i < 0 ? u41.a.getChildCount() : A(i);
        ((xw2) this.X).W(childCount, z);
        if (z) {
            E(view);
        }
        RecyclerView recyclerView = u41.a;
        recyclerView.addView(view, childCount);
        b7c U = RecyclerView.U(view);
        f6c f6c = recyclerView.E0;
        if (!(f6c == null || U == null)) {
            f6c.w(U);
        }
        ArrayList arrayList = recyclerView.U0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o6c) recyclerView.U0.get(size)).d(view);
            }
        }
    }

    public void b(bke bke, h75 h75, pse pse) {
    }

    public int c(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.b = i;
            if (i2 < charSequence.length()) {
                return c(this.b, charSequence);
            }
            v(this, "Unexpected EOF during unicode escape", 0, (String) null, 6);
            throw null;
        }
        int x = x(i + 3, charSequence);
        ((StringBuilder) this.Y).append((char) (x + (x(i, charSequence) << 12) + (x(i + 1, charSequence) << 8) + (x(i + 2, charSequence) << 4)));
        return i2;
    }

    public void d(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        u41 u41 = (u41) this.o;
        int childCount = i < 0 ? u41.a.getChildCount() : A(i);
        ((xw2) this.X).W(childCount, z);
        if (z) {
            E(view);
        }
        u41.getClass();
        b7c U = RecyclerView.U(view);
        RecyclerView recyclerView = u41.a;
        if (U != null) {
            if (U.r() || U.w()) {
                if (RecyclerView.Q1) {
                    U.toString();
                }
                U.y0 &= -257;
            } else {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(U);
                throw new IllegalArgumentException(th2.g(recyclerView, sb));
            }
        } else if (RecyclerView.P1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(th2.g(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void e(cke cke, i75 i75, pse pse) {
    }

    public void f(ija ija) {
        cke cke;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        int i;
        cke cke2;
        int i2;
        int i3;
        int i4;
        SparseArray sparseArray2;
        ija ija2 = ija;
        if (ija.u() == 2) {
            mse mse = (mse) this.c;
            int i5 = mse.a;
            int i6 = 0;
            List list = mse.c;
            if (i5 == 1 || i5 == 2 || mse.C0 == 1) {
                cke = (cke) list.get(0);
            } else {
                cke = new cke(((cke) list.get(0)).d());
                list.add(cke);
            }
            if ((ija.u() & 128) != 0) {
                ija2.H(1);
                int A = ija.A();
                int i7 = 3;
                ija2.H(3);
                wx1 wx1 = (wx1) this.o;
                ija2.e(0, wx1.b, 2);
                wx1.q(0);
                wx1.t(3);
                mse.I0 = wx1.i(13);
                ija2.e(0, wx1.b, 2);
                wx1.q(0);
                wx1.t(4);
                ija2.H(wx1.i(12));
                cc4 cc4 = mse.Y;
                int i8 = mse.a;
                if (i8 == 2 && mse.G0 == null) {
                    rse b2 = cc4.b(21, new di9(21, (String) null, 0, (ArrayList) null, oze.f));
                    mse.G0 = b2;
                    if (b2 != null) {
                        b2.e(cke, mse.B0, new pse(A, 21, 8192, 1));
                    }
                }
                SparseArray sparseArray3 = (SparseArray) this.X;
                sparseArray3.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.Y;
                sparseIntArray.clear();
                int a2 = ija.a();
                while (true) {
                    sparseBooleanArray = mse.x0;
                    if (a2 <= 0) {
                        break;
                    }
                    ija2.e(i6, wx1.b, 5);
                    wx1.q(i6);
                    int i9 = wx1.i(8);
                    wx1.t(i7);
                    int i10 = wx1.i(13);
                    wx1.t(4);
                    int i11 = wx1.i(12);
                    int i12 = ija2.b;
                    int i13 = i12 + i11;
                    int i14 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i15 = 0;
                    wx1 wx12 = wx1;
                    while (ija2.b < i13) {
                        int u = ija.u();
                        int u2 = ija2.b + ija.u();
                        if (u2 > i13) {
                            break;
                        }
                        cke cke3 = cke;
                        if (u == 5) {
                            long w = ija.w();
                            if (w == 1094921523) {
                                i14 = 129;
                            } else if (w == 1161904947) {
                                i14 = 135;
                            } else if (w != 1094921524) {
                                if (w == 1212503619) {
                                    i14 = 36;
                                }
                            }
                            sparseArray2 = sparseArray3;
                            i4 = A;
                            i3 = i10;
                            ija2.H(u2 - ija2.b);
                            sparseArray3 = sparseArray2;
                            cke = cke3;
                            A = i4;
                            i10 = i3;
                        } else {
                            if (u == 106) {
                                sparseArray2 = sparseArray3;
                                i4 = A;
                                i3 = i10;
                                i14 = 129;
                            } else if (u == 122) {
                                sparseArray2 = sparseArray3;
                                i4 = A;
                                i3 = i10;
                                i14 = 135;
                            } else if (u == 127) {
                                int u3 = ija.u();
                                if (u3 != 21) {
                                    if (u3 == 14) {
                                        i14 = 136;
                                    } else if (u3 == 33) {
                                        i14 = 139;
                                    }
                                    sparseArray2 = sparseArray3;
                                    i4 = A;
                                    i3 = i10;
                                }
                            } else {
                                if (u == 123) {
                                    sparseArray2 = sparseArray3;
                                    i14 = 138;
                                } else if (u == 10) {
                                    String trim = ija2.s(3, f22.c).trim();
                                    i15 = ija.u();
                                    sparseArray2 = sparseArray3;
                                    str = trim;
                                } else {
                                    if (u == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (ija2.b < u2) {
                                            String trim2 = ija2.s(3, f22.c).trim();
                                            ija.u();
                                            SparseArray sparseArray4 = sparseArray3;
                                            byte[] bArr = new byte[4];
                                            ija2.e(0, bArr, 4);
                                            arrayList2.add(new ose(bArr, trim2));
                                            sparseArray3 = sparseArray4;
                                            A = A;
                                            i10 = i10;
                                        }
                                        sparseArray2 = sparseArray3;
                                        i4 = A;
                                        i3 = i10;
                                        arrayList = arrayList2;
                                        i14 = 89;
                                    } else {
                                        sparseArray2 = sparseArray3;
                                        i4 = A;
                                        i3 = i10;
                                        if (u == 111) {
                                            i14 = 257;
                                        }
                                    }
                                    ija2.H(u2 - ija2.b);
                                    sparseArray3 = sparseArray2;
                                    cke = cke3;
                                    A = i4;
                                    i10 = i3;
                                }
                                i4 = A;
                                i3 = i10;
                            }
                            ija2.H(u2 - ija2.b);
                            sparseArray3 = sparseArray2;
                            cke = cke3;
                            A = i4;
                            i10 = i3;
                        }
                        i14 = 172;
                        sparseArray2 = sparseArray3;
                        i4 = A;
                        i3 = i10;
                        ija2.H(u2 - ija2.b);
                        sparseArray3 = sparseArray2;
                        cke = cke3;
                        A = i4;
                        i10 = i3;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    cke cke4 = cke;
                    int i16 = A;
                    int i17 = i10;
                    ija2.G(i13);
                    di9 di9 = new di9(i14, str, i15, arrayList, Arrays.copyOfRange(ija2.a, i12, i13));
                    if (i9 == 6 || i9 == 5) {
                        i9 = i14;
                    }
                    a2 -= i11 + 5;
                    int i18 = i8 == 2 ? i9 : i17;
                    if (sparseBooleanArray.get(i18)) {
                        sparseArray3 = sparseArray5;
                    } else {
                        rse b3 = (i8 == 2 && i9 == 21) ? mse.G0 : cc4.b(i9, di9);
                        if (i8 == 2) {
                            i2 = i17;
                            if (i2 >= sparseIntArray.get(i18, 8192)) {
                                sparseArray3 = sparseArray5;
                            }
                        } else {
                            i2 = i17;
                        }
                        sparseIntArray.put(i18, i2);
                        sparseArray3 = sparseArray5;
                        sparseArray3.put(i18, b3);
                    }
                    wx1 = wx12;
                    cke = cke4;
                    A = i16;
                    i6 = 0;
                    i7 = 3;
                }
                cke cke5 = cke;
                int i19 = A;
                int size = sparseIntArray.size();
                int i20 = 0;
                while (true) {
                    sparseArray = mse.w0;
                    if (i20 >= size) {
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i20);
                    int valueAt = sparseIntArray.valueAt(i20);
                    sparseBooleanArray.put(keyAt, true);
                    mse.y0.put(valueAt, true);
                    rse rse = (rse) sparseArray3.valueAt(i20);
                    if (rse != null) {
                        if (rse != mse.G0) {
                            i75 i75 = mse.B0;
                            i = i19;
                            pse pse = new pse(i, keyAt, 8192, 1);
                            cke2 = cke5;
                            rse.e(cke2, i75, pse);
                        } else {
                            cke2 = cke5;
                            i = i19;
                        }
                        sparseArray.put(valueAt, rse);
                    } else {
                        cke2 = cke5;
                        i = i19;
                    }
                    i20++;
                    cke5 = cke2;
                    i19 = i;
                }
                if (i8 != 2) {
                    sparseArray.remove(this.b);
                    int i21 = i8 == 1 ? 0 : mse.C0 - 1;
                    mse.C0 = i21;
                    if (i21 == 0) {
                        mse.B0.w();
                        mse.D0 = true;
                    }
                } else if (!mse.D0) {
                    mse.B0.w();
                    mse.C0 = 0;
                    mse.D0 = true;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        if (r28.v() == 21) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(defpackage.yze r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            int r2 = r28.v()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            java.lang.Object r2 = r0.c
            lse r2 = (defpackage.lse) r2
            int r4 = r2.a
            r5 = 1
            r6 = 0
            java.util.List r7 = r2.b
            if (r4 == r5) goto L_0x0032
            if (r4 == r3) goto L_0x0032
            int r4 = r2.l
            if (r4 != r5) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            bke r4 = new bke
            java.lang.Object r8 = r7.get(r6)
            bke r8 = (defpackage.bke) r8
            long r8 = r8.c()
            r4.<init>(r8)
            r7.add(r4)
            goto L_0x0038
        L_0x0032:
            java.lang.Object r4 = r7.get(r6)
            bke r4 = (defpackage.bke) r4
        L_0x0038:
            int r7 = r28.v()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x0041
            return
        L_0x0041:
            r1.I(r5)
            int r7 = r28.A()
            r8 = 3
            r1.I(r8)
            java.lang.Object r9 = r0.o
            wx1 r9 = (defpackage.wx1) r9
            byte[] r10 = r9.b
            r1.g(r6, r10, r3)
            r9.q(r6)
            r9.t(r8)
            r10 = 13
            int r11 = r9.i(r10)
            r2.r = r11
            byte[] r11 = r9.b
            r1.g(r6, r11, r3)
            r9.q(r6)
            r11 = 4
            r9.t(r11)
            r12 = 12
            int r13 = r9.i(r12)
            r1.I(r13)
            cc4 r13 = r2.e
            int r14 = r2.a
            r15 = 8192(0x2000, float:1.14794E-41)
            r5 = 0
            r12 = 21
            if (r14 != r3) goto L_0x00a1
            qse r3 = r2.p
            if (r3 != 0) goto L_0x00a1
            jj7 r3 = new jj7
            byte[] r11 = defpackage.mze.f
            r3.<init>(r12, r5, r5, r11)
            qse r3 = r13.a(r12, r3)
            r2.p = r3
            if (r3 == 0) goto L_0x00a1
            h75 r11 = r2.k
            pse r5 = new pse
            r10 = 0
            r5.<init>((int) r7, (int) r12, (int) r15, (int) r10)
            r3.b(r4, r11, r5)
        L_0x00a1:
            java.lang.Object r3 = r0.X
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            r3.clear()
            java.lang.Object r5 = r0.Y
            android.util.SparseIntArray r5 = (android.util.SparseIntArray) r5
            r5.clear()
            int r10 = r28.c()
        L_0x00b3:
            android.util.SparseBooleanArray r11 = r2.g
            if (r10 <= 0) goto L_0x0232
            byte[] r15 = r9.b
            r12 = 5
            r1.g(r6, r15, r12)
            r9.q(r6)
            r15 = 8
            int r15 = r9.i(r15)
            r9.t(r8)
            r6 = 13
            int r8 = r9.i(r6)
            r6 = 4
            r9.t(r6)
            r6 = 12
            int r16 = r9.i(r6)
            int r6 = r1.b
            int r12 = r6 + r16
            r17 = -1
            r19 = r7
            r18 = r9
            r9 = r17
            r0 = 0
            r17 = r4
            r4 = 0
        L_0x00e9:
            int r7 = r1.b
            if (r7 >= r12) goto L_0x01c7
            int r7 = r28.v()
            int r20 = r28.v()
            r21 = r3
            int r3 = r1.b
            int r3 = r3 + r20
            if (r3 <= r12) goto L_0x0104
        L_0x00fd:
            r20 = r5
            r24 = r8
            r8 = 4
            goto L_0x01cb
        L_0x0104:
            r20 = 172(0xac, float:2.41E-43)
            r22 = 135(0x87, float:1.89E-43)
            r23 = 129(0x81, float:1.81E-43)
            r24 = r8
            r8 = 5
            if (r7 != r8) goto L_0x013f
            long r7 = r28.w()
            r25 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r25 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r25 != 0) goto L_0x011d
            r9 = r23
            goto L_0x013a
        L_0x011d:
            r25 = 1161904947(0x45414333, double:5.74057318E-315)
            int r23 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r23 != 0) goto L_0x0127
            r9 = r22
            goto L_0x013a
        L_0x0127:
            r22 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r22 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r22 != 0) goto L_0x0131
        L_0x012e:
            r9 = r20
            goto L_0x013a
        L_0x0131:
            r22 = 1212503619(0x48455643, double:5.990563836E-315)
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L_0x013a
            r9 = 36
        L_0x013a:
            r20 = r5
        L_0x013c:
            r8 = 4
            goto L_0x01b9
        L_0x013f:
            r8 = 106(0x6a, float:1.49E-43)
            if (r7 != r8) goto L_0x0148
            r20 = r5
            r9 = r23
            goto L_0x013c
        L_0x0148:
            r8 = 122(0x7a, float:1.71E-43)
            if (r7 != r8) goto L_0x0151
            r20 = r5
            r9 = r22
            goto L_0x013c
        L_0x0151:
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 != r8) goto L_0x015e
            int r7 = r28.v()
            r8 = 21
            if (r7 != r8) goto L_0x013a
            goto L_0x012e
        L_0x015e:
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 != r8) goto L_0x0168
            r7 = 138(0x8a, float:1.93E-43)
            r20 = r5
            r9 = r7
            goto L_0x013c
        L_0x0168:
            r8 = 10
            if (r7 != r8) goto L_0x0178
            java.nio.charset.Charset r0 = defpackage.f22.c
            r7 = 3
            java.lang.String r0 = r1.t(r7, r0)
            java.lang.String r0 = r0.trim()
            goto L_0x013a
        L_0x0178:
            r8 = 89
            if (r7 != r8) goto L_0x01af
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0181:
            int r7 = r1.b
            if (r7 >= r3) goto L_0x01a9
            java.nio.charset.Charset r7 = defpackage.f22.c
            r9 = 3
            java.lang.String r7 = r1.t(r9, r7)
            java.lang.String r7 = r7.trim()
            r28.v()
            r8 = 4
            byte[] r9 = new byte[r8]
            r20 = r5
            r5 = 0
            r1.g(r5, r9, r8)
            nse r5 = new nse
            r5.<init>(r9, r7)
            r4.add(r5)
            r5 = r20
            r8 = 89
            goto L_0x0181
        L_0x01a9:
            r20 = r5
            r8 = 4
            r9 = 89
            goto L_0x01b9
        L_0x01af:
            r20 = r5
            r8 = 4
            r5 = 111(0x6f, float:1.56E-43)
            if (r7 != r5) goto L_0x01b9
            r5 = 257(0x101, float:3.6E-43)
            r9 = r5
        L_0x01b9:
            int r5 = r1.b
            int r3 = r3 - r5
            r1.I(r3)
            r5 = r20
            r3 = r21
            r8 = r24
            goto L_0x00e9
        L_0x01c7:
            r21 = r3
            goto L_0x00fd
        L_0x01cb:
            r1.H(r12)
            jj7 r3 = new jj7
            byte[] r5 = r1.a
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r12)
            r3.<init>(r9, r0, r4, r5)
            r0 = 6
            if (r15 == r0) goto L_0x01df
            r0 = 5
            if (r15 != r0) goto L_0x01e0
        L_0x01df:
            r15 = r9
        L_0x01e0:
            int r16 = r16 + 5
            int r10 = r10 - r16
            r0 = 2
            if (r14 != r0) goto L_0x01e9
            r4 = r15
            goto L_0x01eb
        L_0x01e9:
            r4 = r24
        L_0x01eb:
            boolean r5 = r11.get(r4)
            if (r5 == 0) goto L_0x01f8
            r6 = r20
            r0 = r21
            r5 = 21
            goto L_0x0221
        L_0x01f8:
            r5 = 21
            if (r14 != r0) goto L_0x0201
            if (r15 != r5) goto L_0x0201
            qse r3 = r2.p
            goto L_0x0205
        L_0x0201:
            qse r3 = r13.a(r15, r3)
        L_0x0205:
            r6 = r20
            if (r14 != r0) goto L_0x0217
            r0 = 8192(0x2000, float:1.14794E-41)
            int r7 = r6.get(r4, r0)
            r0 = r24
            if (r0 >= r7) goto L_0x0214
            goto L_0x0219
        L_0x0214:
            r0 = r21
            goto L_0x0221
        L_0x0217:
            r0 = r24
        L_0x0219:
            r6.put(r4, r0)
            r0 = r21
            r0.put(r4, r3)
        L_0x0221:
            r3 = r0
            r12 = r5
            r5 = r6
            r4 = r17
            r9 = r18
            r7 = r19
            r6 = 0
            r8 = 3
            r15 = 8192(0x2000, float:1.14794E-41)
            r0 = r27
            goto L_0x00b3
        L_0x0232:
            r0 = r3
            r17 = r4
            r6 = r5
            r19 = r7
            int r1 = r6.size()
            r5 = 0
        L_0x023d:
            android.util.SparseArray r3 = r2.f
            if (r5 >= r1) goto L_0x0287
            int r4 = r6.keyAt(r5)
            int r7 = r6.valueAt(r5)
            r8 = 1
            r11.put(r4, r8)
            android.util.SparseBooleanArray r9 = r2.h
            r9.put(r7, r8)
            java.lang.Object r8 = r0.valueAt(r5)
            qse r8 = (defpackage.qse) r8
            if (r8 == 0) goto L_0x027a
            qse r9 = r2.p
            if (r8 == r9) goto L_0x0270
            h75 r9 = r2.k
            pse r10 = new pse
            r12 = 0
            r13 = r19
            r15 = 8192(0x2000, float:1.14794E-41)
            r10.<init>((int) r13, (int) r4, (int) r15, (int) r12)
            r4 = r17
            r8.b(r4, r9, r10)
            goto L_0x0276
        L_0x0270:
            r4 = r17
            r13 = r19
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0276:
            r3.put(r7, r8)
            goto L_0x0280
        L_0x027a:
            r4 = r17
            r13 = r19
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0280:
            int r5 = r5 + 1
            r17 = r4
            r19 = r13
            goto L_0x023d
        L_0x0287:
            r5 = 2
            if (r14 != r5) goto L_0x029a
            boolean r0 = r2.m
            if (r0 != 0) goto L_0x02b6
            h75 r0 = r2.k
            r0.w()
            r0 = 0
            r2.l = r0
            r1 = 1
            r2.m = r1
            goto L_0x02b6
        L_0x029a:
            r4 = r27
            r0 = 0
            r1 = 1
            int r4 = r4.b
            r3.remove(r4)
            if (r14 != r1) goto L_0x02a7
            r6 = r0
            goto L_0x02ab
        L_0x02a7:
            int r0 = r2.l
            int r6 = r0 + -1
        L_0x02ab:
            r2.l = r6
            if (r6 != 0) goto L_0x02b6
            h75 r0 = r2.k
            r0.w()
            r2.m = r1
        L_0x02b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.g(yze):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [oz2, java.lang.Object] */
    public Object get() {
        Range range = ((n80) this.X).a;
        m80 m80 = (m80) this.Y;
        int L = gwf.L(156000, m80.c, 2, m80.b, 48000, range);
        ? obj = new Object();
        obj.b = -1;
        String str = (String) this.o;
        if (str != null) {
            obj.a = str;
            obj.b = Integer.valueOf(this.b);
            kje kje = (kje) this.c;
            if (kje != null) {
                obj.c = kje;
                obj.f = Integer.valueOf(m80.c);
                obj.e = Integer.valueOf(m80.b);
                obj.d = Integer.valueOf(L);
                return obj.e();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public boolean h() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.c;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i++;
                } else {
                    this.b = i;
                    return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
                }
            } else {
                this.b = i;
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void i() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r4.c     // Catch:{ all -> 0x0015 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0015 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0017
            int r0 = r4.b     // Catch:{ all -> 0x0015 }
            int r0 = r0 + 1
            r4.b = r0     // Catch:{ all -> 0x0015 }
            monitor-exit(r4)
            return
        L_0x0015:
            r0 = move-exception
            goto L_0x005b
        L_0x0017:
            java.lang.Object r1 = r4.Y     // Catch:{ all -> 0x0015 }
            ew0 r1 = (defpackage.ew0) r1     // Catch:{ all -> 0x0015 }
            my1 r2 = new my1     // Catch:{ all -> 0x0015 }
            r3 = 3
            r2.<init>(r4, r3, r0)     // Catch:{ all -> 0x0015 }
            r1.v(r2)     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r4.c     // Catch:{ all -> 0x0015 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0015 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0015 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0015 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0015 }
            r2 = -9223372036854775808
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            java.lang.Object r0 = r4.Y     // Catch:{ all -> 0x0015 }
            ew0 r0 = (defpackage.ew0) r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r4.X     // Catch:{ all -> 0x0015 }
            o96 r1 = (defpackage.o96) r1     // Catch:{ all -> 0x0015 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0015 }
            ny1 r2 = new ny1     // Catch:{ all -> 0x0015 }
            r3 = 1
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0015 }
            r0.v(r2)     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r4.c     // Catch:{ all -> 0x0015 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0015 }
            r0.remove()     // Catch:{ all -> 0x0015 }
        L_0x0059:
            monitor-exit(r4)
            return
        L_0x005b:
            monitor-exit(r4)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.i():void");
    }

    public void j(int i, String str) {
        String str2 = (String) this.c;
        if (str2.length() - i >= str.length()) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                if (str.charAt(i2) == (str2.charAt(i + i2) | ' ')) {
                    i2++;
                } else {
                    v(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6);
                    throw null;
                }
            }
            this.b = str.length() + i;
            return;
        }
        v(this, "Unexpected end of boolean literal", 0, (String) null, 6);
        throw null;
    }

    public String l() {
        int i;
        String str;
        n('\"');
        int i2 = this.b;
        String str2 = (String) this.c;
        int Z = h0e.Z(str2, '\"', i2, false, 4);
        if (Z != -1) {
            int i3 = i2;
            while (i < Z) {
                if (str2.charAt(i) == '\\') {
                    int i4 = this.b;
                    char charAt = str2.charAt(i);
                    boolean z = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            ((StringBuilder) this.Y).append(str2, i4, i);
                            int P = P(i + 1);
                            if (P != -1) {
                                int i5 = P + 1;
                                char charAt2 = str2.charAt(P);
                                if (charAt2 == 'u') {
                                    i5 = c(i5, str2);
                                } else {
                                    char c2 = charAt2 < 'u' ? v12.a[charAt2] : 0;
                                    if (c2 != 0) {
                                        ((StringBuilder) this.Y).append(c2);
                                    } else {
                                        v(this, "Invalid escaped char '" + charAt2 + '\'', 0, (String) null, 6);
                                        throw null;
                                    }
                                }
                                i4 = P(i5);
                                if (i4 == -1) {
                                    v(this, "Unexpected EOF", i4, (String) null, 4);
                                    throw null;
                                }
                            } else {
                                v(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6);
                                throw null;
                            }
                        } else {
                            i++;
                            if (i >= str2.length()) {
                                ((StringBuilder) this.Y).append(str2, i4, i);
                                i4 = P(i);
                                if (i4 == -1) {
                                    v(this, "Unexpected EOF", i4, (String) null, 4);
                                    throw null;
                                }
                            } else {
                                continue;
                                charAt = str2.charAt(i);
                            }
                        }
                        i = i4;
                        z = true;
                        charAt = str2.charAt(i);
                    }
                    if (!z) {
                        str = str2.subSequence(i4, i).toString();
                    } else {
                        ((StringBuilder) this.Y).append(str2, i4, i);
                        StringBuilder sb = (StringBuilder) this.Y;
                        String sb2 = sb.toString();
                        sb.setLength(0);
                        str = sb2;
                    }
                    this.b = i + 1;
                    return str;
                }
                i3 = i + 1;
            }
            this.b = Z + 1;
            return str2.substring(i2, Z);
        }
        q();
        w((byte) 1, false);
        throw null;
    }

    public byte m() {
        String str;
        int i = this.b;
        while (true) {
            str = (String) this.c;
            if (i == -1 || i >= str.length()) {
                this.b = str.length();
            } else {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i = i2;
                } else {
                    this.b = i2;
                    return xie.j(charAt);
                }
            }
        }
        this.b = str.length();
        return 10;
    }

    public void n(char c2) {
        int i = this.b;
        if (i != -1) {
            while (true) {
                String str = (String) this.c;
                if (i < str.length()) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                        i = i2;
                    } else {
                        this.b = i2;
                        if (charAt != c2) {
                            W(c2);
                            throw null;
                        }
                        return;
                    }
                } else {
                    this.b = -1;
                    W(c2);
                    throw null;
                }
            }
        } else {
            W(c2);
            throw null;
        }
    }

    public String o() {
        String str = (String) this.X;
        if (str == null) {
            return l();
        }
        this.X = null;
        return str;
    }

    public synchronized void p() {
        this.b = 0;
        ((ArrayDeque) this.c).clear();
    }

    public String q() {
        String str;
        String str2 = (String) this.X;
        if (str2 != null) {
            this.X = null;
            return str2;
        }
        int T = T();
        String str3 = (String) this.c;
        if (T >= str3.length() || T == -1) {
            v(this, "EOF", T, (String) null, 4);
            throw null;
        }
        byte j = xie.j(str3.charAt(T));
        if (j == 1) {
            return o();
        }
        if (j == 0) {
            boolean z = false;
            while (xie.j(str3.charAt(T)) == 0) {
                T++;
                if (T >= str3.length()) {
                    ((StringBuilder) this.Y).append(str3, this.b, T);
                    int P = P(T);
                    if (P == -1) {
                        this.b = T;
                        ((StringBuilder) this.Y).append(str3, 0, 0);
                        StringBuilder sb = (StringBuilder) this.Y;
                        String sb2 = sb.toString();
                        sb.setLength(0);
                        return sb2;
                    }
                    T = P;
                    z = true;
                }
            }
            if (!z) {
                str = str3.subSequence(this.b, T).toString();
            } else {
                ((StringBuilder) this.Y).append(str3, this.b, T);
                StringBuilder sb3 = (StringBuilder) this.Y;
                String sb4 = sb3.toString();
                sb3.setLength(0);
                str = sb4;
            }
            this.b = T;
            return str;
        }
        v(this, "Expected beginning of the string, but got " + str3.charAt(T), 0, (String) null, 6);
        throw null;
    }

    public String r() {
        String q = q();
        if (hhd.f(q, "null")) {
            if (((String) this.c).charAt(this.b - 1) != '\"') {
                v(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6);
                throw null;
            }
        }
        return q;
    }

    public void t(int i) {
        int A = A(i);
        ((xw2) this.X).Z(A);
        RecyclerView recyclerView = ((u41) this.o).a;
        View childAt = recyclerView.getChildAt(A);
        if (childAt != null) {
            b7c U = RecyclerView.U(childAt);
            if (U != null) {
                if (!U.r() || U.w()) {
                    if (RecyclerView.Q1) {
                        U.toString();
                    }
                    U.f(256);
                } else {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(U);
                    throw new IllegalArgumentException(th2.g(recyclerView, sb));
                }
            }
        } else if (RecyclerView.P1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(A);
            throw new IllegalArgumentException(th2.g(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(A);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((xw2) this.X).toString() + ", hidden list:" + ((ArrayList) this.Y).size();
            case 10:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((String) this.c);
                sb.append("', currentPosition=");
                return hr1.h(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public void u(int i, String str, String str2) {
        String concat = str2.length() == 0 ? BuildConfig.FLAVOR : "\n".concat(str2);
        StringBuilder n = me4.n(str, " at path: ");
        n.append(((jn) this.o).u());
        n.append(concat);
        throw gp0.b(n.toString(), (String) this.c, i);
    }

    public void w(byte b2, boolean z) {
        String J = xie.J(b2);
        int i = z ? this.b - 1 : this.b;
        int i2 = this.b;
        String str = (String) this.c;
        v(this, c3d.i("Expected ", J, ", but had '", (i2 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, (String) null, 4);
        throw null;
    }

    public int x(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        v(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6);
        throw null;
    }

    public View y(int i) {
        return ((u41) this.o).a.getChildAt(A(i));
    }

    public int z() {
        return ((u41) this.o).a.getChildCount() - ((ArrayList) this.Y).size();
    }

    public ope(w2d w2d, int i, List list, nu7 nu7, List list2) {
        this.a = 9;
        this.o = w2d;
        this.b = i;
        this.X = list;
        this.Y = nu7;
        this.c = list2;
    }

    public ope(b04 b04, rx rxVar, String str, String str2) {
        this.a = 8;
        int i = rxVar.b;
        this.a = 8;
        this.b = i;
        this.o = b04;
        this.X = rxVar;
        this.Y = str;
        this.c = str2;
    }

    public ope(h96 h96, o96 o96, ew0 ew0) {
        this.a = 5;
        this.o = h96;
        this.X = o96;
        this.Y = ew0;
        this.c = new ArrayDeque();
    }

    public ope(ku1 ku1) {
        this.a = 3;
        this.b = 0;
        this.X = new HashMap();
        this.c = new HashSet();
        this.o = new ArrayList();
        this.Y = new ArrayList();
        Set<Set> hashSet = new HashSet<>();
        try {
            hashSet = ku1.a.G();
        } catch (CameraAccessExceptionCompat unused) {
        }
        for (Set arrayList : hashSet) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() >= 2) {
                String str = (String) arrayList2.get(0);
                String str2 = (String) arrayList2.get(1);
                try {
                    if (js.x(ku1, str) && js.x(ku1, str2)) {
                        ((HashSet) this.c).add(new HashSet(Arrays.asList(new String[]{str, str2})));
                        HashMap hashMap = (HashMap) this.X;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str)).add((String) arrayList2.get(1));
                        ((List) hashMap.get(str2)).add((String) arrayList2.get(0));
                    }
                } catch (InitializationException unused2) {
                }
            }
        }
    }

    public ope(String str, int i, n80 n80, m80 m80) {
        this.a = 2;
        kje kje = kje.a;
        this.o = str;
        this.b = i;
        this.c = kje;
        this.X = n80;
        this.Y = m80;
    }

    public ope(u41 u41) {
        this.a = 4;
        this.b = 0;
        this.o = u41;
        this.X = new xw2(0);
        this.Y = new ArrayList();
    }

    public ope(i9c[] i9cArr, f55[] f55Arr, upe upe, bu7 bu7) {
        this.a = 0;
        this.o = i9cArr;
        this.X = (f55[]) f55Arr.clone();
        this.Y = upe;
        this.c = bu7;
        this.b = i9cArr.length;
    }

    public ope(j9c[] j9cArr, g55[] g55Arr, spe spe, cu7 cu7) {
        this.a = 1;
        oyb.d(j9cArr.length == g55Arr.length);
        this.o = j9cArr;
        this.X = (g55[]) g55Arr.clone();
        this.Y = spe;
        this.c = cu7;
        this.b = j9cArr.length;
    }

    public ope() {
        byte[] bArr;
        byte[] bArr2;
        this.a = 6;
        int glCreateProgram = GLES20.glCreateProgram();
        this.b = glCreateProgram;
        ete.k();
        ete.a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        ete.a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            if (valueOf.length() != 0) {
                "Unable to link shader program: \n".concat(valueOf);
            }
        }
        GLES20.glUseProgram(glCreateProgram);
        this.Y = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.o = new gk9[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.b;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[i2];
            int[] iArr6 = new int[i2];
            byte[] bArr3 = new byte[i5];
            int i6 = i5;
            int i7 = i4;
            GLES20.glGetActiveAttrib(i4, i3, i5, iArr4, 0, iArr5, 0, iArr6, 0, bArr3, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i6) {
                    bArr2 = bArr3;
                    i8 = i6;
                    break;
                }
                bArr2 = bArr3;
                if (bArr2[i8] == 0) {
                    break;
                }
                i8++;
                bArr3 = bArr2;
            }
            String str = new String(bArr2, 0, i8);
            GLES20.glGetAttribLocation(i7, str);
            gk9 gk9 = new gk9(11);
            ((gk9[]) this.o)[i3] = gk9;
            ((HashMap) this.Y).put(str, gk9);
            i3++;
            i2 = 1;
        }
        this.c = new HashMap();
        int[] iArr7 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr7, 0);
        this.X = new hk9[iArr7[0]];
        for (int i9 = 0; i9 < iArr7[i]; i9++) {
            int i10 = this.b;
            int[] iArr8 = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr8, i);
            int i11 = iArr8[i];
            byte[] bArr4 = new byte[i11];
            int i12 = i11;
            GLES20.glGetActiveUniform(i10, i9, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    bArr = bArr4;
                    i13 = i12;
                    break;
                }
                bArr = bArr4;
                if (bArr[i13] == 0) {
                    break;
                }
                i13++;
                bArr4 = bArr;
            }
            i = 0;
            String str2 = new String(bArr, 0, i13);
            GLES20.glGetUniformLocation(i10, str2);
            hk9 hk9 = new hk9(11);
            ((hk9[]) this.X)[i9] = hk9;
            ((HashMap) this.c).put(str2, hk9);
        }
        ete.k();
    }

    public ope(String str) {
        this.a = 10;
        jn jnVar = new jn(0, 13);
        jnVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        jnVar.o = iArr;
        jnVar.b = -1;
        this.o = jnVar;
        this.Y = new StringBuilder();
        this.c = str;
    }

    public ope(lse lse, int i) {
        this.a = 11;
        this.c = lse;
        this.o = new wx1(new byte[5], 5, 1, (byte) 0);
        this.X = new SparseArray();
        this.Y = new SparseIntArray();
        this.b = i;
    }

    public ope(mse mse, int i) {
        this.a = 12;
        this.c = mse;
        this.o = new wx1(new byte[5], 5, 2, (byte) 0);
        this.X = new SparseArray();
        this.Y = new SparseIntArray();
        this.b = i;
    }

    public ope(xb6 xb6, vb6[] vb6Arr) {
        this.a = 7;
        this.c = xb6;
        int length = vb6Arr.length;
        this.o = new vb6[length];
        this.b = length - 1;
        int f = xb6.f() + 1;
        vb6[][] vb6Arr2 = new vb6[f][];
        int[] iArr = new int[f];
        for (vb6 vb6 : vb6Arr) {
            int i = vb6.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < f; i2++) {
            vb6Arr2[i2] = new vb6[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (vb6 vb62 : vb6Arr) {
            int i3 = vb62.a.a;
            vb6[] vb6Arr3 = vb6Arr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            vb6Arr3[i4] = vb62;
        }
        this.X = vb6Arr2;
        this.Y = new int[(((xb6) this.c).f() + 1)];
    }
}
