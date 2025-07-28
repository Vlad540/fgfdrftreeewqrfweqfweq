package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.webrtc.VideoEncoderObserver;

/* renamed from: xp0  reason: default package */
public class xp0 implements gf5, i36, n96, m96, py4, VideoEncoderObserver, gm8 {
    public boolean a;
    public Object b;

    public /* synthetic */ xp0(Object obj) {
        this.b = obj;
    }

    public void a(Object obj) {
        List list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        if (this.a) {
            arrayList.removeAll(Collections.singleton((Object) null));
        }
        ((sn1) this.b).b(arrayList);
    }

    public void b(mn4 mn4) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        ez3.m(size, arrayList.size() + 1);
        arrayList.add(size, mn4);
        if (this.a) {
            mn4.g();
        }
    }

    public mn4 c(int i) {
        return (mn4) ((ArrayList) this.b).get(i);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [i41, ig7] */
    public void d() {
        if (!this.a) {
            this.a = true;
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new bdd(i));
            }
            ((i41) this.b).E(arrayList);
        }
    }

    public void e(Throwable th) {
        boolean z = th instanceof TimeoutException;
        sn1 sn1 = (sn1) this.b;
        if (z) {
            sn1.d(th);
        } else {
            sn1.b(Collections.emptyList());
        }
    }

    public void f(pl8 pl8, boolean z) {
        i7 i7Var;
        if (!this.a) {
            this.a = true;
            wle wle = (wle) this.b;
            ActionMenuView actionMenuView = wle.f.a.a;
            if (!(actionMenuView == null || (i7Var = actionMenuView.w0) == null)) {
                i7Var.g();
                f7 f7Var = i7Var.I0;
                if (f7Var != null && f7Var.b()) {
                    f7Var.j.dismiss();
                }
            }
            wle.g.onPanelClosed(108, pl8);
            this.a = false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [i41, ig7] */
    public void g() {
        if (this.a) {
            this.a = false;
            ((i41) this.b).E(hw4.a);
        }
    }

    public void h(File file) {
        m64 m64;
        k64 g;
        if (this.a && (g = m64.g(m64, file)) != null) {
            String str = g.b;
            if (str == ".tmp") {
                long lastModified = file.lastModified();
                (m64 = (m64) this.b).e.getClass();
                if (lastModified > System.currentTimeMillis() - m64.f) {
                    return;
                }
            } else {
                ez3.o(str == ".cnt");
                return;
            }
        }
        file.delete();
    }

    public void i() {
        if (this.a) {
            ((w4g) this.b).i();
        }
    }

    public void j() {
        this.a = true;
    }

    public void k(p96 p96) {
        if (this.a) {
            ((w4g) this.b).k(p96);
        }
    }

    public void l(File file) {
        if (!this.a && file.equals(((m64) this.b).c)) {
            this.a = true;
        }
    }

    public synchronized void m() {
        if (this.a) {
            ((w4g) this.b).m();
        }
    }

    public void n(File file) {
        m64 m64 = (m64) this.b;
        if (!m64.a.equals(file) && !this.a) {
            file.delete();
        }
        if (this.a && file.equals(m64.c)) {
            this.a = false;
        }
    }

    public void o() {
        this.a = false;
    }

    public void onEncoderChanged(VideoEncoderObserver.EncoderInfo encoderInfo) {
        zla zla = (zla) this.b;
        xwb xwb = zla.O0;
        StringBuilder sb = new StringBuilder("Encoder for ");
        boolean z = this.a;
        sb.append(z ? "camera" : "screen share");
        sb.append(" updated: ");
        sb.append(encoderInfo.getEncoderType());
        sb.append(", ");
        sb.append(encoderInfo.getImplementationName());
        sb.append(", isHw: ");
        sb.append(encoderInfo.isHardwareAccelerated());
        xwb.log("PCRTCClient", sb.toString());
        if (z) {
            zla.i("onCameraEncoderInfoChanged", new tyf(zla, new sla(this, 5, encoderInfo), 1));
        }
    }

    public synchronized void p() {
        if (this.a) {
            ((w4g) this.b).p();
        }
    }

    public void q() {
        this.a = false;
    }

    public void r() {
        if (!this.a) {
            this.a = true;
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) this.b;
                if (i < arrayList.size()) {
                    ((mn4) arrayList.get(i)).g();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void release() {
        xwb xwb = ((zla) this.b).O0;
        xwb.log("PCRTCClient", "Encoder observer released isCamera=(" + this.a + ")");
    }

    public synchronized void s(p96 p96, long j) {
        if (this.a) {
            ((w4g) this.b).s(p96, j);
        }
    }

    public void t() {
        if (this.a) {
            int i = 0;
            this.a = false;
            while (true) {
                ArrayList arrayList = (ArrayList) this.b;
                if (i < arrayList.size()) {
                    ((mn4) arrayList.get(i)).h();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void u(char c) {
        og0 og0 = (og0) this.b;
        og0.r(og0.b, 1);
        int i = og0.b;
        og0.b = i + 1;
        ((char[]) og0.c)[i] = c;
    }

    public void v(String str) {
        ((og0) this.b).K(str);
    }

    public void w(String str) {
        int i;
        int i2;
        og0 og0 = (og0) this.b;
        og0.getClass();
        og0.r(og0.b, str.length() + 2);
        char[] cArr = (char[]) og0.c;
        int i3 = og0.b;
        int i4 = i3 + 1;
        cArr[i3] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i4);
        int i5 = length + i4;
        int i6 = i4;
        while (i < i5) {
            char c = cArr[i];
            byte[] bArr = c0e.b;
            if (c >= bArr.length || bArr[c] == 0) {
                i6 = i + 1;
            } else {
                int length2 = str.length();
                for (int i7 = i - i4; i7 < length2; i7++) {
                    og0.r(i, 2);
                    char charAt = str.charAt(i7);
                    byte[] bArr2 = c0e.b;
                    if (charAt < bArr2.length) {
                        byte b2 = bArr2[charAt];
                        if (b2 == 0) {
                            i2 = i + 1;
                            ((char[]) og0.c)[i] = (char) charAt;
                        } else {
                            if (b2 == 1) {
                                String str2 = c0e.a[charAt];
                                og0.r(i, str2.length());
                                str2.getChars(0, str2.length(), (char[]) og0.c, i);
                                int length3 = str2.length() + i;
                                og0.b = length3;
                                i = length3;
                            } else {
                                char[] cArr2 = (char[]) og0.c;
                                cArr2[i] = '\\';
                                cArr2[i + 1] = (char) b2;
                                i += 2;
                                og0.b = i;
                            }
                        }
                    } else {
                        i2 = i + 1;
                        ((char[]) og0.c)[i] = (char) charAt;
                    }
                    i = i2;
                }
                og0.r(i, 1);
                ((char[]) og0.c)[i] = '\"';
                og0.b = i + 1;
                return;
            }
        }
        cArr[i5] = '\"';
        og0.b = i5 + 1;
    }

    public boolean x(pl8 pl8) {
        ((wle) this.b).g.onMenuOpened(108, pl8);
        return true;
    }

    public void y() {
    }

    public void z() {
    }

    public /* synthetic */ xp0(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public xp0(boolean z, my7 my7) {
        this.a = z;
        this.b = my7;
    }

    public xp0(og0 og0) {
        this.b = og0;
        this.a = true;
    }

    public xp0() {
        this.a = false;
        this.b = new ArrayList();
    }
}
