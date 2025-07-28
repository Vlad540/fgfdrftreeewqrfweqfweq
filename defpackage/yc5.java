package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yc5  reason: default package */
public final /* synthetic */ class yc5 implements of3, v1b, j26, dh5, i83, j75, k75, kt0, h67, e26, so6, to6, x1b {
    public final /* synthetic */ int a;

    public /* synthetic */ yc5(int i) {
        this.a = i;
    }

    public d75[] a() {
        switch (this.a) {
            case 13:
                return new d75[]{new oi5()};
            default:
                return new d75[]{new to5()};
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                udd.s("ad5", "onEvent: UpdateMessageEvent: message deleted", (Throwable) obj);
                return;
            case 1:
                udd.s("ad5", "failed to open file attach", (Throwable) obj);
                return;
            case 2:
                udd.s("ad5", "onEvent DownloadCompleteEvent: failed", (Throwable) obj);
                return;
            case 5:
                udd.s("ad5", "initFileSharingProgressDialog: error", (Throwable) obj);
                return;
            case 18:
                udd.s("FrgAttachView", "fail", (Throwable) obj);
                return;
            case 19:
                udd.s("ru.ok.messages.views.fragments.FrgProfilePhoto", "fail", (Throwable) obj);
                return;
            default:
                m00 m00 = (m00) obj;
                m00.i = g10.o;
                m00.k = 0.0f;
                m00.p = 0;
                m00.o = 0;
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m85apply(Object obj) {
        ov0 ov0 = (ov0) obj;
        CancellationException cancellationException = fr6.l;
        return true;
    }

    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 23:
                return false;
            default:
                return false;
        }
    }

    public lt0 e(Bundle bundle) {
        switch (this.a) {
            case LangUtils.HASH_SEED:
                tu5 tu5 = new tu5();
                if (bundle != null) {
                    ClassLoader classLoader = mt0.class.getClassLoader();
                    int i = mze.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                vu5 vu5 = vu5.V0;
                String str = vu5.a;
                if (string == null) {
                    string = str;
                }
                tu5.a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = vu5.b;
                }
                tu5.b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = vu5.c;
                }
                tu5.c = string3;
                tu5.d = bundle.getInt(Integer.toString(3, 36), vu5.o);
                tu5.e = bundle.getInt(Integer.toString(4, 36), vu5.X);
                tu5.f = bundle.getInt(Integer.toString(5, 36), vu5.Y);
                tu5.g = bundle.getInt(Integer.toString(6, 36), vu5.Z);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = vu5.x0;
                }
                tu5.h = string4;
                y29 parcelable = bundle.getParcelable(Integer.toString(8, 36));
                if (parcelable == null) {
                    parcelable = vu5.y0;
                }
                tu5.i = parcelable;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = vu5.z0;
                }
                tu5.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = vu5.A0;
                }
                tu5.k = string6;
                tu5.l = bundle.getInt(Integer.toString(11, 36), vu5.B0);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    String num = Integer.toString(12, 36);
                    String num2 = Integer.toString(i2, 36);
                    StringBuilder sb = new StringBuilder(me4.e(me4.e(1, num), num2));
                    sb.append(num);
                    sb.append("_");
                    sb.append(num2);
                    byte[] byteArray = bundle.getByteArray(sb.toString());
                    if (byteArray == null) {
                        tu5.m = arrayList;
                        tu5.n = bundle.getParcelable(Integer.toString(13, 36));
                        tu5.o = bundle.getLong(Integer.toString(14, 36), vu5.E0);
                        tu5.p = bundle.getInt(Integer.toString(15, 36), vu5.F0);
                        tu5.q = bundle.getInt(Integer.toString(16, 36), vu5.G0);
                        tu5.r = bundle.getFloat(Integer.toString(17, 36), vu5.H0);
                        tu5.s = bundle.getInt(Integer.toString(18, 36), vu5.I0);
                        tu5.t = bundle.getFloat(Integer.toString(19, 36), vu5.J0);
                        tu5.u = bundle.getByteArray(Integer.toString(20, 36));
                        tu5.v = bundle.getInt(Integer.toString(21, 36), vu5.L0);
                        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
                        tu5.w = bundle2 == null ? null : new y23(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
                        tu5.x = bundle.getInt(Integer.toString(23, 36), vu5.N0);
                        tu5.y = bundle.getInt(Integer.toString(24, 36), vu5.O0);
                        tu5.z = bundle.getInt(Integer.toString(25, 36), vu5.P0);
                        tu5.A = bundle.getInt(Integer.toString(26, 36), vu5.Q0);
                        tu5.B = bundle.getInt(Integer.toString(27, 36), vu5.R0);
                        tu5.C = bundle.getInt(Integer.toString(28, 36), vu5.S0);
                        tu5.D = bundle.getInt(Integer.toString(29, 36), vu5.T0);
                        return new vu5(tu5);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            default:
                swb.e(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new kf6(bundle.getBoolean(Integer.toString(2, 36), false)) : new kf6();
        }
    }

    public void f(long j) {
    }

    public String g(Context context) {
        switch (this.a) {
            case 8:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 9:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 10:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    public Object h(uwb uwb) {
        return FirebaseInstallationsRegistrar.a(uwb);
    }

    public Object parse(m67 m67) {
        switch (this.a) {
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return GetAnonymTokenByLinkRequest.lambda$static$0(m67);
            case 26:
                return InternalIdResponse.parse(m67);
            case 28:
                return JoinByLinkResponse.lambda$static$0(m67);
            default:
                return m67.H();
        }
    }

    public boolean test(Object obj) {
        return ((xm8) obj).a.l(j10.y0);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return ((xm8) obj).a.D0.x(j10.y0);
            case 6:
                return new xb5((String) null, Collections.singletonList(new vb5(3, 0, 0, 0, ((pd5) obj).c)));
            default:
                pj6 pj6 = (pj6) obj;
                pj6.d();
                return ws6.j(jjd.S(new kce(19), pj6.X0.b));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public e75[] m84a() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION:
                return new e75[]{new pi5()};
            default:
                return new e75[]{new uo5()};
        }
    }
}
