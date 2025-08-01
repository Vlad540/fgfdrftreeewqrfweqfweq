package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: f18  reason: default package */
public final class f18 extends Handler {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f18(cd8 cd8, Looper looper) {
        super(looper);
        this.c = cd8;
    }

    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference != null) {
                    Messenger messenger = (Messenger) weakReference.get();
                    h18 h18 = (h18) ((WeakReference) this.b).get();
                    if (messenger != null && h18 != null) {
                        Bundle data = message.getData();
                        vc8.a(data);
                        try {
                            int i = message.what;
                            if (i == 1) {
                                vc8.a(data.getBundle("data_root_hints"));
                                data.getString("data_media_item_id");
                                uc8 uc8 = (uc8) wa7.a(data.getParcelable("data_media_session_token"), uc8.CREATOR);
                                return;
                            } else if (i == 2) {
                                return;
                            } else {
                                if (i != 3) {
                                    message.toString();
                                    return;
                                }
                                vc8.a(data.getBundle("data_options"));
                                vc8.a(data.getBundle("data_notify_children_changed_options"));
                                String string = data.getString("data_media_item_id");
                                ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                                Parcelable.Creator<i18> creator = i18.CREATOR;
                                if (parcelableArrayList != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                                        arrayList.add(wa7.a((Parcelable) parcelableArrayList.get(i2), creator));
                                    }
                                }
                                if (h18.g == messenger) {
                                    if (string != null) {
                                        hr1.r(h18.e.get(string));
                                    }
                                    int i3 = j18.b;
                                    return;
                                }
                                return;
                            }
                        } catch (BadParcelableException unused) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    public f18(h18 h18) {
        this.b = new WeakReference(h18);
    }
}
