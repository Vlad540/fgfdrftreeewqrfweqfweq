package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.SavedStateHandlesVM;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import one.me.messages.list.loader.MessageModel;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: gp0  reason: default package */
public abstract class gp0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final lq6 g = new lq6("SVG", ".svg");
    public static final ns7 h = new ns7(16);
    public static final lu7 i = new Object();
    public static final gf6 j = new gf6(16);
    public static boolean k;
    public static AnimatedFactoryV2Impl l;

    public static d4b A() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map n = z3d.n(allStackTraces);
        Throwable th = null;
        try {
            Throwable th2 = null;
            Throwable th3 = null;
            Throwable th4 = null;
            for (Map.Entry next : allStackTraces.entrySet()) {
                Thread thread = (Thread) next.getKey();
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                String str = thread.getName() + " (state=" + thread.getState() + ", pid=" + thread.getId() + ")";
                if (p0e.M(thread.getName(), "main", true)) {
                    th4 = new Throwable(str);
                    th4.setStackTrace(stackTraceElementArr);
                } else if (th3 != null) {
                    Throwable th5 = new Throwable(str, th3);
                    th5.setStackTrace(stackTraceElementArr);
                    th3 = th5;
                } else {
                    th2 = new Throwable(str);
                    th2.setStackTrace(stackTraceElementArr);
                    th3 = th2;
                }
            }
            if (!(th4 == null || th2 == null)) {
                th2.initCause(th4);
            }
            th = th3;
        } catch (Throwable unused) {
        }
        return new d4b(n, 10, th);
    }

    public static Set B() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static final Object C(r72 r72, ws8 ws8) {
        if (og5.$EnumSwitchMapping$0[r72.ordinal()] == 1) {
            return uzc.b(ws8);
        }
        try {
            ws8.z();
            return null;
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                return null;
            }
            if (t != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
    }

    public static void D(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c(textView, drawable);
        c(textView, drawable2);
        c(textView, drawable3);
        c(textView, drawable4);
    }

    public static int E(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    public static int F(Object obj) {
        return E(obj == null ? 0 : obj.hashCode());
    }

    public static wsf G(ftf ftf, Integer num, juf juf) {
        BacklogWorker backlogWorker;
        cfa build = new bfa(BacklogWorker.class).setBackoffCriteria(he0.b, num.longValue(), TimeUnit.SECONDS).build();
        if (!(juf == null || (backlogWorker = BacklogWorker.Y) == null)) {
            synchronized (backlogWorker.c) {
                udd.p("BACKLOG_WORKER", "stayAlive, isRunning = %b", new Object[]{Boolean.valueOf(backlogWorker.X)});
                backlogWorker.o.add(juf.a);
            }
        }
        a35 a35 = a35.b;
        ftf.getClass();
        List singletonList = Collections.singletonList(build);
        itf itf = (itf) ftf;
        if (!singletonList.isEmpty()) {
            return new wsf(itf, "BACKLOG_WORKER", a35, singletonList);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public static final List H(MessageModel messageModel) {
        ArrayList arrayList;
        b68 b68;
        rz rzVar = messageModel.y0.d;
        boolean z = rzVar instanceof sy7;
        hw4 hw4 = hw4.a;
        if (!z && !(rzVar instanceof pc5)) {
            return hw4;
        }
        if (rzVar instanceof w13) {
            List<q13> list = ((w13) rzVar).b;
            arrayList = new ArrayList(q23.H(list, 10));
            for (q13 q13 : list) {
                if (q13 instanceof tp6) {
                    tp6 tp6 = (tp6) q13;
                    b68 = new b68(messageModel.a, tp6.a, rzVar, tp6, (String) null, 48);
                } else if (q13 instanceof q1f) {
                    q1f q1f = (q1f) q13;
                    b68 = new i68(messageModel.a, q1f.a, rzVar, q1f);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(b68);
            }
        } else if (rzVar instanceof qhd) {
            tp6 tp62 = ((qhd) rzVar).c;
            return Collections.singletonList(new b68(messageModel.a, tp62.a, rzVar, tp62, (String) null, 48));
        } else if (rzVar instanceof wid) {
            q1f q1f2 = ((wid) rzVar).c;
            return Collections.singletonList(new i68(messageModel.a, q1f2.a, rzVar, q1f2));
        } else if (!(rzVar instanceof pc5)) {
            return hw4;
        } else {
            arrayList = new ArrayList();
            pc5 pc5 = (pc5) rzVar;
            tp6 tp63 = pc5.k;
            if (tp63 != null) {
                arrayList.add(new b68(messageModel.a, tp63.a, rzVar, tp63, pc5.c, 16));
            } else {
                q1f q1f3 = pc5.l;
                if (q1f3 != null) {
                    arrayList.add(new i68(messageModel.a, q1f3.a, rzVar, q1f3, pc5.c));
                }
            }
        }
        return arrayList;
    }

    public static void I(nr0 nr0, byte[] bArr) {
        long j2;
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = nr0.X;
            int i3 = nr0.Y;
            int i4 = nr0.Z;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
            j2 = nr0.o;
            if (j2 == nr0.a.b) {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (nr0.d(j2 == -1 ? 0 : j2 + ((long) (nr0.Z - nr0.Y))) != -1);
    }

    public static final void J(bve bve) {
        bve.e(qna.class, new vz9(13));
        bve.e(dna.class, new vz9(14));
    }

    public static final JsonEncodingException a(syc syc) {
        return new IllegalArgumentException("Value of type '" + syc.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + syc.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException b(String str, CharSequence charSequence, int i2) {
        StringBuilder n = me4.n(str, "\nJSON input: ");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = str2 + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str3 = i3 <= 0 ? "" : str2;
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder l2 = hr1.l(str3);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                l2.append(charSequence.subSequence(i3, i4).toString());
                l2.append(str2);
                charSequence = l2.toString();
            }
        }
        n.append(charSequence);
        String sb = n.toString();
        if (i2 >= 0) {
            sb = "Unexpected JSON token at offset " + i2 + ": " + sb;
        }
        return new IllegalArgumentException(sb);
    }

    public static void c(View view, Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            Objects.requireNonNull(animationDrawable);
            view.post(new oc4(3, animationDrawable));
        }
    }

    public static i63 d(u16... u16Arr) {
        if (u16Arr.length > 0) {
            return new i63(0, u16Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static int e(Comparable comparable, Comparable comparable2) {
        if (comparable != null && comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        if (!(comparable == null && comparable2 == null)) {
            if (comparable != null || comparable2 == null) {
                return (comparable == null || comparable2 != null) ? 0 : 1;
            }
            return -1;
        }
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final tkc g(pb9 pb9) {
        ns7 ns7 = h;
        LinkedHashMap linkedHashMap = pb9.a;
        zkc zkc = (zkc) linkedHashMap.get(ns7);
        if (zkc != null) {
            cbf cbf = (cbf) linkedHashMap.get(i);
            if (cbf != null) {
                Bundle bundle = (Bundle) linkedHashMap.get(j);
                String str = (String) linkedHashMap.get(dr9.X);
                if (str != null) {
                    wkc d2 = zkc.y().d();
                    wkc wkc = d2 instanceof wkc ? d2 : null;
                    if (wkc != null) {
                        SavedStateHandlesVM r = r(cbf);
                        tkc tkc = (tkc) r.b.get(str);
                        if (tkc != null) {
                            return tkc;
                        }
                        Class[] clsArr = tkc.f;
                        wkc.b();
                        Bundle bundle2 = wkc.c;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = wkc.c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = wkc.c;
                        if (bundle5 != null && bundle5.isEmpty()) {
                            wkc.c = null;
                        }
                        tkc o = kjd.o(bundle3, bundle);
                        r.b.put(str, o);
                        return o;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void h(zkc zkc) {
        ob7 ob7 = zkc.R().d;
        if (ob7 != ob7.b && ob7 != ob7.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (zkc.y().d() == null) {
            wkc wkc = new wkc(zkc.y(), (cbf) zkc);
            zkc.y().f("androidx.lifecycle.internal.SavedStateHandlesProvider", wkc);
            zkc.R().a(new d6c(7, wkc));
        }
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static w3d j(Set set, u1b u1b) {
        if (set instanceof SortedSet) {
            w3d w3d = (SortedSet) set;
            if (w3d instanceof w3d) {
                w3d w3d2 = w3d;
                u1b u1b2 = w3d2.b;
                u1b2.getClass();
                return new w3d((SortedSet) w3d2.a, new y1b(Arrays.asList(new u1b[]{u1b2, u1b})));
            }
            w3d.getClass();
            return new w3d(w3d, u1b);
        } else if (set instanceof w3d) {
            w3d w3d3 = (w3d) set;
            u1b u1b3 = w3d3.b;
            u1b3.getClass();
            return new w3d((Set) w3d3.a, new y1b(Arrays.asList(new u1b[]{u1b3, u1b})));
        } else {
            set.getClass();
            return new w3d(set, u1b);
        }
    }

    public static final int k(RecyclerView recyclerView, float f2) {
        LinearLayoutManager q = q(recyclerView);
        if (q == null) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        } else if (f2 == 1.0f) {
            return q.X0();
        } else {
            if (f2 == 0.0f) {
                return q.Y0();
            }
            int Y0 = q.Y0();
            View r = q.r(Y0);
            return (r == null || ((float) (recyclerView.getMeasuredHeight() - r.getTop())) < ((float) r.getMeasuredHeight()) * f2) ? q.X0() : Y0;
        }
    }

    public static kme l(RecyclerView recyclerView) {
        kme kme = new kme(new ga3(3));
        kme.v(recyclerView);
        return kme;
    }

    public static int m(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final int n(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int o(Cursor cursor, String str) {
        String str2;
        int n = n(cursor, str);
        if (n >= 0) {
            return n;
        }
        try {
            str2 = cs.d0(cursor.getColumnNames(), (String) null, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException(me4.j("column '", str, "' does not exist. Available columns: ", str2));
    }

    public static final GridLayoutManager p(RecyclerView recyclerView) {
        GridLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return layoutManager;
        }
        return null;
    }

    public static final LinearLayoutManager q(RecyclerView recyclerView) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager;
        }
        return null;
    }

    public static final SavedStateHandlesVM r(cbf cbf) {
        return new w4g(cbf.v(), new Object(), cbf instanceof le6 ? ((le6) cbf).o() : fw3.b, 17).u(m7c.a(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final yqd s(RecyclerView recyclerView) {
        Object tag = recyclerView.getTag(v9a.a);
        if (tag instanceof yqd) {
            return (yqd) tag;
        }
        return null;
    }

    public static int t(Context context) {
        int X = a24.X(((float) 81) * dh4.c().getDisplayMetrics().density);
        int X2 = (context.getResources().getDisplayMetrics().widthPixels - (a24.X(((float) 12) * dh4.c().getDisplayMetrics().density) * 2)) / (X + a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
        if (X2 < 1) {
            return 1;
        }
        return X2;
    }

    public static int u(int i2, Object obj) {
        if (obj == null) {
            return i2 * 37;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                i2 = u(i2, Array.get(obj, i3));
            }
            return i2;
        }
        return (i2 * 37) + obj.hashCode();
    }

    public static int v(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static int w(Integer num) {
        int intValue = num.intValue();
        int[] w = hr1.w(9);
        int length = w.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            int i4 = w[i3];
            if (hr1.t(i4) == intValue) {
                i2 = i4;
                break;
            }
            i3++;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public static v3d x(Set set, gt6 gt6) {
        a06.m(set, "set1");
        a06.m(gt6, "set2");
        return new v3d(set, gt6);
    }

    public static final void y(ope ope, String str) {
        ope.u(ope.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void z(ope ope) {
        y(ope, "object");
        throw null;
    }
}
