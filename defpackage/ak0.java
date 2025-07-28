package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.text.Collator;
import java.util.Collections;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ak0  reason: default package */
public final /* synthetic */ class ak0 implements h67, of3, e26, ApplicationNameProvider, j26, a3b, x89, w1b, kt0, lk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ak0(int i) {
        this.a = i;
    }

    public static Bitmap b(int i, byte[] bArr) {
        try {
            return e07.q(bArr, i, (BitmapFactory.Options) null);
        } catch (ParserException e) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new Exception(e2);
        }
    }

    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return w30.f(totalCaptureResult, false);
            case 13:
                return w30.f(totalCaptureResult, false);
            default:
                return w30.f(totalCaptureResult, true);
        }
    }

    public void accept(Object obj, Object obj2) {
        Collator collator = (Collator) obj;
        Throwable th = (Throwable) obj2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                return ((e75) obj).m().getClass().getSimpleName();
            case 9:
                oa1 oa1 = (oa1) obj;
                return new lp1(new oa1(oa1.c, oa1.a, oa1.b));
            case 11:
                Throwable th = (Throwable) obj;
                return dhd.g(Collections.emptyList());
            default:
                t33 t33 = (t33) obj;
                t33.getClass();
                Bundle bundle = new Bundle();
                v1d v1d = t33.a;
                if (v1d != null) {
                    bundle.putBundle(t33.i, v1d.b());
                }
                int i = t33.b;
                if (i != -1) {
                    bundle.putInt(t33.j, i);
                }
                int i2 = t33.c;
                if (i2 != 0) {
                    bundle.putInt(t33.p, i2);
                }
                int i3 = t33.d;
                if (i3 != 0) {
                    bundle.putInt(t33.k, i3);
                }
                CharSequence charSequence = t33.f;
                if (charSequence != "") {
                    bundle.putCharSequence(t33.l, charSequence);
                }
                Bundle bundle2 = t33.g;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle(t33.m, bundle2);
                }
                Uri uri = t33.e;
                if (uri != null) {
                    bundle.putParcelable(t33.o, uri);
                }
                boolean z = t33.h;
                if (!z) {
                    bundle.putBoolean(t33.n, z);
                }
                return bundle;
        }
    }

    public void d(y4e y4e) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(y4e.b.getWidth(), y4e.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        y4e.b(surface, pa2.j(), new cv1(surface, 0, surfaceTexture));
    }

    public lt0 e(Bundle bundle) {
        return new y23(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public Object f(ws8 ws8) {
        int i;
        String str;
        ws8 ws82 = ws8;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            Throwable th2 = th;
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th2);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        long j = 0;
        long j2 = 0;
        String str2 = null;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th3) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th3);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 != 0) {
                    if (t2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    int hashCode = str.hashCode();
                    if (hashCode != -1900987004) {
                        if (hashCode != 3355) {
                            if (hashCode != 92902992) {
                                if (hashCode == 1133704324) {
                                    if (str.equals("permissions")) {
                                        i2 = jjd.I(ws8);
                                    }
                                }
                            } else if (str.equals("alias")) {
                                str2 = jjd.M(ws8);
                            }
                        } else if (str.equals(ApiProtocol.KEY_ID)) {
                            j = jjd.J(ws82, 0);
                        }
                    } else if (str.equals("inviterId")) {
                        j2 = jjd.J(ws82, 0);
                    }
                    ws8.z();
                } catch (Throwable th4) {
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = uzc.a.iterator();
                    while (it3.hasNext()) {
                        ((ny9) it3.next()).getClass();
                        ny9.a(th4);
                    }
                    int t3 = hr1.t(m4b.a);
                    if (t3 != 0) {
                        if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        return new ga(i2, j, j2, str2);
    }

    public String getName() {
        return "";
    }

    public Object parse(m67 m67) {
        switch (this.a) {
            case 0:
                return BatchInternalIdResponse.parse(m67);
            default:
                return CallInfo.parse(m67);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r1 = r2.k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean test(java.lang.Object r2) {
        /*
            r1 = this;
            int r1 = r1.a
            i22 r2 = (defpackage.i22) r2
            switch(r1) {
                case 17: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r1 = r2.J()
            return r1
        L_0x000c:
            boolean r1 = r2.J()
            r0 = 1
            if (r1 != 0) goto L_0x0014
            goto L_0x0022
        L_0x0014:
            tf3 r1 = r2.k()
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.s()
            if (r1 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak0.test(java.lang.Object):boolean");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                udd.s("zo0", "Failed to delete all botCommands", (Throwable) obj);
                return;
            case 3:
                udd.s("zo0", "Failed to store botCommands", (Throwable) obj);
                return;
            case 6:
                udd.s("uv0", "onViewCreated: failed", (Throwable) obj);
                return;
            case 10:
                udd.s("lb1", "loadInternal: failed", (Throwable) obj);
                return;
            case 18:
                ((y52) obj).L = 0;
                return;
            case 19:
                udd.s("t52", "updateChatLastSearchClickTimeAsync: failed", (Throwable) obj);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                udd.s("t52", "error while localRemoveChat", (Throwable) obj);
                return;
            case 21:
                udd.s("t52", "updateChatWriteTimeAsync: failed", (Throwable) obj);
                return;
            case 22:
                ((y52) obj).m0 = null;
                return;
            case 26:
                ((gi3) obj).j = 2;
                return;
            case 27:
                udd.s("ContactController", "changeLastSearchClickTimeAsync: failed", (Throwable) obj);
                return;
            default:
                udd.s("ContactController", "changeLastShowingUnknownContactBar: failed", (Throwable) obj);
                return;
        }
    }
}
