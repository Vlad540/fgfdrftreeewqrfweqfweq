package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.XmlResourceParser;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* renamed from: ibe  reason: default package */
public abstract class ibe implements CameraEnumerator {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ ibe() {
        this.a = 10;
    }

    public static float J(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    public abstract IntentFilter A();

    public void B(RecyclerView recyclerView) {
        f6c f6c = (f6c) this.c;
        if (f6c != null || ((h6c) this.b) != null) {
            if (!(f6c == null || recyclerView.getAdapter() == ((f6c) this.c))) {
                String name = getClass().getName();
                f6c adapter = recyclerView.getAdapter();
                udd.S(name, "adapter was changed! cached adapter = " + ((f6c) this.c) + ", recyclerView.adapter = " + adapter, new IllegalStateException("adapter was changed"));
            }
            f6c f6c2 = (f6c) this.c;
            h6c h6c = (h6c) this.b;
            if (!(f6c2 == null || h6c == null)) {
                f6c2.B(h6c);
            }
            this.c = null;
            this.b = null;
        }
    }

    public Object C(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) at7.b(xmlResourceParser).get(((vg) this.b).a);
        return num != null ? z(context, xmlResourceParser, num.intValue()) : this.c;
    }

    public abstract int D();

    public abstract CameraCharacteristics E(String str);

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = H().getSupportedFormats(str);
            arrayList.add(isFrontFacing(str) ? new bu1(str, supportedFormats) : isBackFacing(str) ? new au1(str, supportedFormats) : new cu1(str, supportedFormats));
        }
        return arrayList;
    }

    public Set G() {
        return Collections.emptySet();
    }

    public abstract CameraEnumerator H();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: du1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: du1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.du1 I(int r3) {
        /*
            r2 = this;
            java.util.ArrayList r2 = r2.F()
            int[] r0 = defpackage.ug0.$EnumSwitchMapping$0
            int r3 = hr1.t(r3)
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x004e
            r0 = 2
            if (r3 == r0) goto L_0x0035
            r0 = 3
            if (r3 != r0) goto L_0x002f
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            r0 = r3
            du1 r0 = (defpackage.du1) r0
            boolean r0 = r0 instanceof defpackage.cu1
            if (r0 == 0) goto L_0x001a
            r1 = r3
        L_0x002c:
            du1 r1 = (defpackage.du1) r1
            goto L_0x0066
        L_0x002f:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0035:
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r2.next()
            r0 = r3
            du1 r0 = (defpackage.du1) r0
            boolean r0 = r0 instanceof defpackage.au1
            if (r0 == 0) goto L_0x0039
            r1 = r3
        L_0x004b:
            du1 r1 = (defpackage.du1) r1
            goto L_0x0066
        L_0x004e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()
            r0 = r3
            du1 r0 = (defpackage.du1) r0
            boolean r0 = r0 instanceof defpackage.bu1
            if (r0 == 0) goto L_0x0052
            r1 = r3
        L_0x0064:
            du1 r1 = (defpackage.du1) r1
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibe.I(int):du1");
    }

    public int K() {
        if (((t97) this.c).a()) {
            return Q().getMeasuredHeight();
        }
        return 0;
    }

    public int L() {
        if (((t97) this.c).a()) {
            return Q().getMeasuredWidth();
        }
        return 0;
    }

    public MenuItem M(MenuItem menuItem) {
        if (!(menuItem instanceof b4e)) {
            return menuItem;
        }
        b4e b4e = (b4e) menuItem;
        if (((kgd) this.c) == null) {
            this.c = new kgd();
        }
        MenuItem menuItem2 = (MenuItem) ((kgd) this.c).get(b4e);
        if (menuItem2 != null) {
            return menuItem2;
        }
        yl8 yl8 = new yl8((Context) this.b, b4e);
        ((kgd) this.c).put(b4e, yl8);
        return yl8;
    }

    public short N() {
        return ((dfa) this.c).a;
    }

    public int O() {
        return ((HashMap) this.b).hashCode();
    }

    public jbe P() {
        return jbe.b0;
    }

    public View Q() {
        return (View) ((t97) this.c).getValue();
    }

    public View R() {
        if (((t97) this.c).a()) {
            return Q();
        }
        return null;
    }

    public abstract void S();

    public void T(int i, int i2) {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            View view = (View) t97.getValue();
            n1g.D(Q(), i, i2, 0, 12);
        }
    }

    public void U(int i, int i2) {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            ((View) t97.getValue()).measure(i, i2);
        }
    }

    public boolean V() {
        return !(this instanceof w60);
    }

    public abstract h6c W(RecyclerView recyclerView, f6c f6c);

    public abstract void X();

    public void Y(View view) {
    }

    public abstract void Z(String str, Executor executor, CameraDevice.StateCallback stateCallback);

    public abstract void a0(mi0 mi0);

    public abstract void b0(ryc ryc, fr1 fr1);

    public abstract void c0();

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        try {
            return H().createCapturer(str, cameraEventsHandler, captureFormatHelper);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((xwb) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public void d(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void d0() {
        y();
        IntentFilter A = A();
        if (A.countActions() != 0) {
            if (((an) this.b) == null) {
                this.b = new an(0, this);
            }
            ((dn) this.c).z0.registerReceiver((an) this.b, A);
        }
    }

    public abstract void e0();

    public abstract void f0();

    public void g(int i, String str) {
        ((HashMap) this.b).put(str, Integer.valueOf(i));
    }

    public abstract void g0(CameraManager.AvailabilityCallback availabilityCallback);

    public String[] getDeviceNames() {
        return H().getDeviceNames();
    }

    public List getSupportedFormats(String str) {
        return H().getSupportedFormats(str);
    }

    public void h(String str, List list) {
        ((HashMap) this.b).put(str, list);
    }

    public void i(String str, long[] jArr) {
        ((HashMap) this.b).put(str, jArr);
    }

    public boolean isBackFacing(String str) {
        return H().isBackFacing(str);
    }

    public boolean isFrontFacing(String str) {
        return H().isFrontFacing(str);
    }

    public void n(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public void p(String str, Map map) {
        ((HashMap) this.b).put(str, map);
    }

    public void s(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ete.S((HashMap) this.b);
            default:
                return super.toString();
        }
    }

    public void u() {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        jjd.e(viewGroup, Q(), new ViewGroup.LayoutParams(-2, -2));
        Q().setVisibility(0);
    }

    public void v(RecyclerView recyclerView) {
        B(recyclerView);
        f6c adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.c = adapter;
            h6c W = W(recyclerView, adapter);
            this.b = W;
            adapter.z(W);
            return;
        }
        throw new IllegalArgumentException("require not null adapter".toString());
    }

    public boolean w() {
        return this instanceof l99;
    }

    public abstract void x();

    public void y() {
        an anVar = (an) this.b;
        if (anVar != null) {
            try {
                ((dn) this.c).z0.unregisterReceiver(anVar);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract Object z(Context context, XmlResourceParser xmlResourceParser, int i);

    public /* synthetic */ ibe(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ibe(xwb xwb) {
        this.a = 4;
        this.b = xwb;
        this.c = getClass().getSimpleName();
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        try {
            return H().createCapturer(str, cameraEventsHandler);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((xwb) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public ibe(u16 u16) {
        this.a = 6;
        this.c = ez3.O(3, new x2(u16, 4, this));
    }

    public ibe(dfa dfa) {
        this.a = 0;
        this.b = new HashMap();
        this.c = dfa;
    }

    public ibe(Context context) {
        this.a = 5;
        this.b = context;
    }

    public ibe(int i) {
        this.a = 9;
        this.c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.c).add(new Object());
        }
    }

    public ibe(CameraDevice cameraDevice, d8 d8Var) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = d8Var;
    }

    public ibe(Context context, gp0 gp0) {
        this.a = 8;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = gp0;
    }

    public ibe(dn dnVar) {
        this.a = 2;
        this.c = dnVar;
    }
}
