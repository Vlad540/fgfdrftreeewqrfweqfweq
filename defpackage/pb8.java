package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: pb8  reason: default package */
public final class pb8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final List c;

    public pb8(ArrayList arrayList, boolean z) {
        this.a = 0;
        this.c = arrayList == null ? Collections.emptyList() : arrayList;
        this.b = z;
    }

    public static pb8 b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new ta8(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new pb8(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        xq1 xq1 = new xq1(2);
        List list = this.c;
        vn1 vn1 = (vn1) xq1.b;
        list.add(vn1);
        vn1.b.c(new px4((Object) this, (Object) xq1, (Object) vn1, 26), pa2.j());
        return new pr1(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{xq1, captureCallback}));
    }

    public ch7 c() {
        List list = this.c;
        if (list.isEmpty()) {
            return as6.c;
        }
        og7 K = ct0.K(new ArrayList(list));
        sr1 sr1 = new sr1(15);
        return ct0.A(ct0.N(K, new e3(sr1), pa2.j()));
    }

    public void d() {
        LinkedList linkedList = new LinkedList(this.c);
        while (!linkedList.isEmpty()) {
            ch7 ch7 = (ch7) linkedList.poll();
            Objects.requireNonNull(ch7);
            ch7.cancel(true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        ta8 ta8 = (ta8) list.get(i);
                        if (ta8 != null && ta8.d()) {
                            i++;
                        }
                    }
                }
                return hr1.j(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public pb8(boolean z) {
        this.a = 1;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = z;
    }
}
