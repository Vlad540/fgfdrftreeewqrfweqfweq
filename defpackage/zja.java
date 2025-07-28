package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.webrtc.CameraVideoCapturer;

/* renamed from: zja  reason: default package */
public final class zja implements CameraVideoCapturer.CameraEventsHandler {
    public final xwb a;

    public /* synthetic */ zja(xwb xwb) {
        this.a = xwb;
    }

    public ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(ge1.a(string));
            } catch (Throwable th) {
                this.a.logException("ParticipantParser", rf0.h("Can't parse id ", string), th);
            }
        }
        return arrayList;
    }

    public void onCameraClosed() {
    }

    public void onCameraDisconnected() {
    }

    public void onCameraError(String str) {
        this.a.reportException("OKRTCSvcFactory", rf0.h("onCameraError(): ", str), new RuntimeException(rf0.h("Camera error: ", str)));
    }

    public void onCameraFreezed(String str) {
        this.a.log("OKRTCSvcFactory", "onCameraFreezed(): " + str);
    }

    public void onCameraOpening(String str) {
    }

    public void onFirstFrameAvailable() {
    }
}
