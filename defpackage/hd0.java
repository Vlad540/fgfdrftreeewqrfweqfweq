package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: hd0  reason: default package */
public final class hd0 implements sx5 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final c q;
    public boolean r;
    public int s;

    public hd0(c cVar) {
        cVar.J();
        hx5 hx5 = cVar.w;
        if (hx5 != null) {
            hx5.B0.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = cVar;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(dy5 dy5) {
        this.a.add(dy5);
        dy5.d = this.b;
        dy5.e = this.c;
        dy5.f = this.d;
        dy5.g = this.e;
    }

    public final void c(int i2) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                dy5 dy5 = (dy5) arrayList.get(i3);
                a aVar = dy5.b;
                if (aVar != null) {
                    aVar.I0 += i2;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(dy5.b);
                        int i4 = dy5.b.I0;
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (!this.r) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new ao7());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z2 = this.g;
            c cVar = this.q;
            if (z2) {
                this.s = cVar.j.getAndIncrement();
            } else {
                this.s = -1;
            }
            cVar.y(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e() {
        if (!this.g) {
            this.q.B(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void f(int i2, a aVar, String str, int i3) {
        String str2 = aVar.f1;
        if (str2 != null) {
            cy5.c(aVar, str2);
        }
        Class<?> cls = aVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = aVar.P0;
            if (str3 == null || str.equals(str3)) {
                aVar.P0 = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + aVar + ": was " + aVar.P0 + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = aVar.N0;
                if (i4 == 0 || i4 == i2) {
                    aVar.N0 = i2;
                    aVar.O0 = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + aVar + ": was " + aVar.N0 + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + aVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new dy5(i3, aVar));
        aVar.J0 = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.i == 0 && this.j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (!(this.k == 0 && this.l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dy5 dy5 = (dy5) arrayList.get(i2);
                switch (dy5.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + dy5.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(dy5.b);
                if (z) {
                    if (!(dy5.d == 0 && dy5.e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(dy5.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(dy5.e));
                    }
                    if (dy5.f != 0 || dy5.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(dy5.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(dy5.g));
                    }
                }
            }
        }
    }

    public final void h(a aVar) {
        c cVar = aVar.J0;
        if (cVar == null || cVar == this.q) {
            b(new dy5(3, aVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [dy5, java.lang.Object] */
    public final void i(a aVar, ob7 ob7) {
        c cVar = aVar.J0;
        c cVar2 = this.q;
        if (cVar != cVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + cVar2);
        } else if (ob7 == ob7.b && aVar.a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + ob7 + " after the Fragment has been created");
        } else if (ob7 != ob7.a) {
            ? obj = new Object();
            obj.a = 10;
            obj.b = aVar;
            obj.c = false;
            obj.h = aVar.g1;
            obj.i = ob7;
            b(obj);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + ob7 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
