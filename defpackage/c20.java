package defpackage;

import android.view.View;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: c20  reason: default package */
public final /* synthetic */ class c20 implements View.OnLongClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ c20(int i) {
        this.a = i;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                int i = AudioAttachView.A0;
                return true;
            default:
                int i2 = AudioListenView.F0;
                return true;
        }
    }
}
