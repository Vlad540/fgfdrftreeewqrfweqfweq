package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.util.Size;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: sr1  reason: default package */
public final /* synthetic */ class sr1 implements t26 {
    public final /* synthetic */ int a;

    public /* synthetic */ sr1(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                Void voidR = (Void) obj;
                return Boolean.TRUE;
            case 1:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) obj;
                int i = es1.g;
                return Boolean.FALSE;
            case 4:
                TotalCaptureResult totalCaptureResult3 = (TotalCaptureResult) obj;
                int i2 = gs1.h;
                return Boolean.FALSE;
            case 5:
                return new f4b((e4b) obj);
            case 6:
                List list = (List) obj;
                zp6 zp6 = bq6.A;
                return null;
            case 7:
                nl7 nl7 = (nl7) obj;
                nl7.a();
                return nl7;
            case 8:
                nl7 nl72 = (nl7) obj;
                nl72.e = false;
                return nl72;
            case 9:
                nl7 nl73 = (nl7) obj;
                nl73.g = true;
                nl73.i = true;
                nl73.h = true;
                return nl73;
            case 10:
                nl7 nl74 = (nl7) obj;
                nl74.e = true;
                return nl74;
            case 11:
                nl7 nl75 = (nl7) obj;
                nl75.e = false;
                nl75.a();
                return nl75;
            case 12:
                nl7 nl76 = (nl7) obj;
                nl76.a();
                nl76.e = false;
                return nl76;
            case 13:
                nl7 nl77 = (nl7) obj;
                nl77.e = false;
                nl77.a();
                return nl77;
            case 14:
                nl7 nl78 = (nl7) obj;
                nl78.a = true;
                nl78.c = true;
                nl78.b = false;
                return nl78;
            case 15:
                List list2 = (List) obj;
                return null;
            case 16:
                try {
                    return s3f.a(r3f.Z1((ib0) obj), (Size) null);
                } catch (InvalidConfigException unused) {
                    return null;
                }
            default:
                List<ytf> list3 = (List) obj;
                if (list3 != null) {
                    arrayList = new ArrayList(q23.H(list3, 10));
                    for (ytf ytf : list3) {
                        List list4 = ytf.g;
                        arrayList.add(new dtf(UUID.fromString(ytf.a), ytf.b, ytf.c, (ArrayList) ytf.f, list4.isEmpty() ^ true ? (zy3) list4.get(0) : zy3.b, ytf.d, ytf.e));
                    }
                }
                return arrayList;
        }
    }
}
