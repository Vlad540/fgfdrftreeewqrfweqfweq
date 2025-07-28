package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: at1  reason: default package */
public final class at1 {
    public final ArrayList a;
    public final ArrayList b;
    public final ea6 c;
    public final ibe d;
    public final xwb e;
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final Object g = new Object();
    public volatile String h = null;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;

    public at1(cs9 cs9, CameraVideoCapturer cameraVideoCapturer, ibe ibe, ArrayList arrayList, ArrayList arrayList2, boolean z, xwb xwb) {
        ArrayList arrayList3 = new ArrayList();
        this.a = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.b = arrayList4;
        this.e = xwb;
        xwb xwb2 = ((n54) cs9).a;
        this.c = new ea6(22, new vka(cameraVideoCapturer, new xu1(xwb2), xwb2));
        this.d = ibe;
        arrayList3.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        this.i = z;
    }

    public final void a() {
        boolean z;
        ArrayList<CameraEnumerationAndroid.CaptureFormat> arrayList;
        synchronized (this.g) {
            try {
                z = this.i;
                arrayList = z ? this.a : this.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e.log("CameraCapturerAdapter", "select capture format for ".concat(z ? "front camera" : "back camera"));
        boolean z2 = d59.a;
        if (!arrayList.isEmpty()) {
            gu6 gu6 = new gu6(17);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : arrayList) {
                int i2 = captureFormat.width;
                if (i2 >= 500) {
                    int i3 = captureFormat.height;
                    if (i2 * i3 <= 921600) {
                        float f2 = ((float) i2) / ((float) i3);
                        if (Math.abs(f2 - 1.7777778f) < 0.1f) {
                            arrayList2.add(captureFormat);
                        } else if (((double) f2) > 1.1d && !z) {
                            arrayList3.add(captureFormat);
                        }
                    }
                }
            }
            Collections.sort(arrayList2, gu6);
            Collections.sort(arrayList3, gu6);
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = arrayList2.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList2.get(0) : arrayList3.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList3.get(0) : (CameraEnumerationAndroid.CaptureFormat) arrayList.get(arrayList.size() - 1);
            int round = Math.round(((float) captureFormat2.framerate.max) / 1000.0f);
            int i4 = (round <= 0 || round > 60) ? 30 : round;
            xwb xwb = this.e;
            StringBuilder sb = new StringBuilder("capture format selected, size: ");
            sb.append(captureFormat2.width);
            sb.append("x");
            th2.l(sb, captureFormat2.height, ", frame rate: ", round, ", actual frame rate: ");
            sb.append(i4);
            xwb.log("CameraCapturerAdapter", sb.toString());
            int i5 = captureFormat2.width;
            int i6 = captureFormat2.height;
            int round2 = i4 < 1000 ? i4 : Math.round(((float) i4) / 1000.0f);
            if (round2 != i4) {
                String g2 = me4.g("Unexpected frame rate requested: ", i4, round2, ", truncated to ");
                this.e.reportException("CameraCapturerAdapter", g2, new IllegalArgumentException(g2));
            }
            xwb xwb2 = this.e;
            StringBuilder i7 = rf0.i("changeFormat, ", i5, "x", i6, "@");
            i7.append(round2);
            xwb2.log("CameraCapturerAdapter", i7.toString());
            if (!(this.n == i5 && this.m == i6 && this.l == round2)) {
                this.l = round2;
                this.m = i6;
                this.n = i5;
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    jl7 jl7 = (jl7) it.next();
                    if (this != jl7.r) {
                        jl7.n.reportException("OKRTCLmsAdapter", "camera.format.change", new RuntimeException("Wrong camera capturer"));
                    }
                    z7f z7f = jl7.y;
                    ((xwb) z7f.c).log("VideoRecord", me4.g("Camera capture dimensions were changed to ", i5, i6, "x"));
                    z7f.z0.width = i5;
                    z7f.z0.height = i6;
                    z7f.u();
                }
                if (this.k) {
                    this.e.log("CameraCapturerAdapter", "Camera is already started, just change capture format");
                    ((CameraVideoCapturer) this.c.b).changeCaptureFormat(i5, i6, round2);
                }
            }
            this.e.log("CameraCapturerAdapter", "start");
            if (this.k) {
                this.e.log("CameraCapturerAdapter", "Camera is already started");
                return;
            }
            if (this.n == 0 || this.m == 0 || this.l == 0) {
                xwb xwb3 = this.e;
                xwb3.log("CameraCapturerAdapter", "start camera capture invalid arguments: " + this.n + "x" + this.m + "@" + this.l);
            }
            try {
                ((CameraVideoCapturer) this.c.b).startCapture(this.n, this.m, this.l);
                this.k = true;
            } catch (RuntimeException e2) {
                this.e.reportException("CameraCapturerAdapter", "Camera start was interrupted", e2);
                Thread.currentThread().interrupt();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void b() {
        this.e.log("CameraCapturerAdapter", "stop");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already stopped");
            return;
        }
        try {
            ((CameraVideoCapturer) this.c.b).stopCapture();
            this.k = false;
        } catch (InterruptedException e2) {
            this.e.reportException("CameraCapturerAdapter", "Camera stop was interrupted", e2);
            Thread.currentThread().interrupt();
        }
    }
}
