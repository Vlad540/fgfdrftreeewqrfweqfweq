package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CameraCaptureSession;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.picker.PickerChatController;
import org.webrtc.CapturerObserver;
import org.webrtc.Size;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: b2b  reason: default package */
public final class b2b implements m7, i36, hx2, g73, ns9, zhd, h96, bw9, CapturerObserver, v2a {
    public static final String[] o = {"name", "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b2b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(long j) {
        SQLiteDatabase writableDatabase;
        c04 c04 = (c04) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (e1f.a(c04.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = c04.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                e1f.b(writableDatabase, 2, hexString, 1);
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void B(a2b a2b) {
        aec aec = (aec) this.b;
        aec.b();
        aec.c();
        try {
            ((sh) this.c).C(a2b);
            aec.r();
        } finally {
            aec.l();
        }
    }

    public void C(Set set) {
        SQLiteDatabase writableDatabase;
        ((String) this.c).getClass();
        try {
            writableDatabase = ((c04) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void D(long j, String str, long j2) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((c04) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, (String) null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public ay E() {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                ez3.j0("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new ay(file, 1);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new ay(file, 1);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 10:
                Void voidR = (Void) obj;
                return;
            case 19:
                sn1 sn1 = (sn1) this.b;
                try {
                    sn1.b(((t26) this.c).apply(obj));
                    return;
                } catch (Throwable th) {
                    sn1.d(th);
                    return;
                }
            default:
                ((wx7) this.c).a(obj);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 12:
                o73 o73 = (o73) this.c;
                o73.getClass();
                Object obj = o73.c;
                zhd zhd = (zhd) this.b;
                if (obj == null) {
                    zhd.onError(new NullPointerException("The value supplied is null"));
                    return;
                } else {
                    zhd.a(obj);
                    return;
                }
            default:
                ((bw9) this.b).b();
                return;
        }
    }

    public void c(Object obj) {
        ((bw9) this.b).c(obj);
    }

    public void d(xi4 xi4) {
        switch (this.a) {
            case 12:
                ((zhd) this.b).d(xi4);
                return;
            case 23:
                bj4.c((AtomicReference) this.b, xi4);
                return;
            default:
                bj4.c((AtomicReference) this.c, xi4);
                return;
        }
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 10:
                gt0.i();
                j54 j54 = (j54) this.c;
                s4b s4b = (s4b) j54.a;
                if (((s4b) this.b) == s4b) {
                    int i = s4b.a;
                    qe4 qe4 = (qe4) j54.X;
                    if (qe4 != null) {
                        qe4.c = null;
                    }
                    j54.a = null;
                    return;
                }
                return;
            default:
                ((sn1) this.b).d(th);
                return;
        }
    }

    public void f() {
        ViewParent parent = ((x2a) this.c).getParent();
        ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    public void g(Executor executor, ls9 ls9) {
        synchronized (((HashMap) this.c)) {
            ai7 ai7 = (ai7) ((HashMap) this.c).get(ls9);
            if (ai7 != null) {
                ai7.a.set(false);
            }
            ai7 ai72 = new ai7(executor, ls9);
            ((HashMap) this.c).put(ls9, ai72);
            pa2.A().execute(new px4((Object) this, (Object) ai7, (Object) ai72, 10));
        }
    }

    public boolean h(n7 n7Var, MenuItem menuItem) {
        return ((m7) this.b).h(n7Var, menuItem);
    }

    public void i(n7 n7Var) {
        ((m7) this.b).i(n7Var);
        dn dnVar = (dn) this.c;
        if (dnVar.L0 != null) {
            dnVar.A0.getDecorView().removeCallbacks(dnVar.M0);
        }
        if (dnVar.K0 != null) {
            zbf zbf = dnVar.N0;
            if (zbf != null) {
                zbf.b();
            }
            zbf a2 = eaf.a(dnVar.K0);
            a2.a(0.0f);
            dnVar.N0 = a2;
            a2.d(new tm(2, this));
        }
        dnVar.J0 = null;
        ViewGroup viewGroup = dnVar.P0;
        WeakHashMap weakHashMap = eaf.a;
        r9f.c(viewGroup);
        dnVar.H();
    }

    public EGLContext j(EGLDisplay eGLDisplay, int i, int[] iArr) {
        if (((EGLContext) this.c) == null) {
            this.c = ((otf) this.b).j(eGLDisplay, i, iArr);
        }
        return (EGLContext) this.c;
    }

    public boolean k(n7 n7Var, pl8 pl8) {
        return ((m7) this.b).k(n7Var, pl8);
    }

    public EGLSurface l(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ((otf) this.b).l(eGLDisplay, obj, i, z);
    }

    public ch7 m() {
        return hwf.f(new hy5(8, this));
    }

    public boolean n(n7 n7Var, Menu menu) {
        ViewGroup viewGroup = ((dn) this.c).P0;
        WeakHashMap weakHashMap = eaf.a;
        r9f.c(viewGroup);
        return ((m7) this.b).n(n7Var, menu);
    }

    public p96 o(int i, int i2, int i3) {
        return ((otf) this.b).o(i, i2, i3);
    }

    public void onCapturerStarted(boolean z) {
        vka vka = (vka) this.c;
        vka.c.log("PatchedVideoCapturer", "onCapturerStarted");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(z);
        }
        vka.getClass();
    }

    public void onCapturerStopped() {
        vka vka = (vka) this.c;
        vka.c.log("PatchedVideoCapturer", "onCapturerStopped");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
        vka.getClass();
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 12:
                ((zhd) this.b).onError(th);
                return;
            case 23:
                ((wx7) this.c).onError(th);
                return;
            default:
                ((bw9) this.b).onError(th);
                return;
        }
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        xu1 xu1 = ((vka) this.c).b;
        xu1.b.a();
        xu1.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - xu1.d >= WorkRequest.MIN_BACKOFF_MILLIS) {
            xu1.a.log("CameraStatCollector", xu1.toString());
            xu1.d = SystemClock.elapsedRealtime();
        }
        if (((CapturerObserver) this.b) != null) {
            VideoSink videoSink = ((vka) this.c).Y;
            ((vka) this.c).getClass();
            if (p0e.M(Build.MANUFACTURER, "xiaomi", true) || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                if (videoSink != null) {
                    videoSink.onFrame(videoFrame);
                }
                ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
                return;
            }
            VideoFrame videoFrame2 = new VideoFrame(new pfc(videoFrame.getBuffer(), videoFrame.getRotation(), ((vka) this.c).X.getHandler(), ((vka) this.c).o), 0, videoFrame.getTimestampNs());
            if (videoSink != null) {
                videoSink.onFrame(videoFrame2);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame2);
        }
    }

    public EGLSurface p(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        ((otf) this.b).getClass();
        return gt0.m(eGLContext, eGLDisplay);
    }

    public void q(long j) {
        k77[] k77Arr = PickerChatController.F0;
        ((PickerChatController) this.b).o0().r(j);
    }

    public void r(ls9 ls9) {
        synchronized (((HashMap) this.c)) {
            try {
                ai7 ai7 = (ai7) ((HashMap) this.c).remove(ls9);
                if (ai7 != null) {
                    ai7.a.set(false);
                    pa2.A().execute(new zo5(this, 11, ai7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public cu3 s() {
        return new cu3(this);
    }

    public boolean t(int i) {
        return ((wi5) this.b).a.get(i);
    }

    public byte[] u(w05 w05) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(w05.a);
            dataOutputStream.writeByte(0);
            String str = w05.b;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(w05.c);
            dataOutputStream.writeLong(w05.o);
            dataOutputStream.write(w05.X);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void v(EGLDisplay eGLDisplay) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.CctBackendFactory w(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.Object r2 = r12.c
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            if (r2 != 0) goto L_0x0082
            java.lang.Object r2 = r12.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r4 != 0) goto L_0x0017
        L_0x0015:
            r2 = r3
            goto L_0x0029
        L_0x0017:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0015 }
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r6 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r5.<init>(r2, r6)     // Catch:{ NameNotFoundException -> 0x0015 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r2 != 0) goto L_0x0027
            goto L_0x0015
        L_0x0027:
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
        L_0x0029:
            if (r2 != 0) goto L_0x0030
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0080
        L_0x0030:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.get(r6)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x003d
            java.lang.String r8 = "backend:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x003d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ","
            r9 = -1
            java.lang.String[] r7 = r7.split(r8, r9)
            int r8 = r7.length
            r9 = 0
        L_0x0064:
            if (r9 >= r8) goto L_0x003d
            r10 = r7[r9]
            java.lang.String r10 = r10.trim()
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0073
            goto L_0x007c
        L_0x0073:
            r11 = 8
            java.lang.String r11 = r6.substring(r11)
            r4.put(r10, r11)
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x007f:
            r2 = r4
        L_0x0080:
            r12.c = r2
        L_0x0082:
            java.lang.Object r12 = r12.c
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x008f
            return r3
        L_0x008f:
            java.lang.Class r13 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r2 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r13 = r13.asSubclass(r2)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.reflect.Constructor r13 = r13.getDeclaredConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.Object r13 = r13.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            com.google.android.datatransport.cct.CctBackendFactory r13 = (com.google.android.datatransport.cct.CctBackendFactory) r13     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            return r13
        L_0x00a4:
            r1.concat(r12)
            goto L_0x00d3
        L_0x00a8:
            r1.concat(r12)
            goto L_0x00d3
        L_0x00ac:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto L_0x00d3
        L_0x00b8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto L_0x00d3
        L_0x00c4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Class "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = " is not found."
            r13.append(r12)
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2b.w(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public HashMap x() {
        Cursor query;
        try {
            ((String) this.c).getClass();
            query = ((c04) this.b).getReadableDatabase().query((String) this.c, o, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                string.getClass();
                hashMap.put(string, new lv0(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public e75 y(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    constructor = ((i74) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (e75) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public Long z(String str) {
        pec a2 = pec.a(1, "SELECT long_value FROM Preference where `key`=?");
        a2.f(1, str);
        aec aec = (aec) this.b;
        aec.b();
        Long l = null;
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            if (o2.moveToFirst()) {
                if (!o2.isNull(0)) {
                    l = Long.valueOf(o2.getLong(0));
                }
            }
            return l;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public /* synthetic */ b2b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ b2b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public b2b(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new LinkedHashMap();
                return;
            case 17:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 22:
                this.b = new yh7();
                this.c = new HashMap();
                return;
            case 26:
                this.b = new otf(14);
                return;
            default:
                this.b = new AtomicReference(Float.valueOf(0.0f));
                this.c = new AtomicBoolean(false);
                return;
        }
    }

    public b2b(yha yha) {
        this.a = 8;
        t97 t97 = mqc.t;
        this.b = yha;
        this.c = t97;
    }

    public b2b(mn mnVar) {
        this.a = 21;
        this.b = (HashMap) mnVar.b;
        this.c = (ArrayList) mnVar.c;
    }

    public b2b(WorkDatabase workDatabase) {
        this.a = 0;
        this.b = workDatabase;
        this.c = new sh(workDatabase, 16);
    }

    public b2b(CameraCaptureSession cameraCaptureSession, h2g h2g) {
        this.a = 9;
        cameraCaptureSession.getClass();
        this.b = cameraCaptureSession;
        this.c = h2g;
    }

    public b2b(File file) {
        this.a = 4;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public b2b(Context context) {
        this.a = 25;
        this.c = null;
        this.b = context;
    }

    public b2b(bm0 bm0) {
        this.a = 5;
        this.c = bm0;
    }

    public b2b(wi5 wi5, SparseArray sparseArray) {
        this.a = 2;
        this.b = wi5;
        SparseBooleanArray sparseBooleanArray = wi5.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int b2 = wi5.b(i);
            gd gdVar = (gd) sparseArray.get(b2);
            gdVar.getClass();
            sparseArray2.append(b2, gdVar);
        }
        this.c = sparseArray2;
    }

    public b2b(sn1 sn1) {
        this.a = 19;
        o36 o36 = ct0.b;
        this.b = sn1;
        this.c = o36;
    }

    public b2b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 20;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public b2b(int i, int i2) {
        this.a = 20;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public b2b(int i, int i2, int i3) {
        this.a = 20;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b2b(i74 i74) {
        this.a = 15;
        this.b = i74;
        this.c = new AtomicBoolean(false);
    }

    public b2b(o48 o48, Looper looper) {
        this.a = 24;
        this.c = o48;
        this.b = new Handler(looper, new fi4(4, this));
    }
}
