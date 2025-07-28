package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: i98  reason: default package */
public final class i98 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i98(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i98 i98 = new i98(continuation, this.Y);
        i98.X = obj;
        return i98;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sg9 sg9 = (sg9) this.X;
        if (sg9 instanceof d98) {
            MediaPickerScreen mediaPickerScreen = this.Y;
            Intent intent = new Intent(mediaPickerScreen.getContext(), ActAvatarCrop.class);
            d98 d98 = (d98) sg9;
            intent.putExtra("ru.ok.tamtam.extra.URI", d98.b);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", d98.c);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            mediaPickerScreen.startActivityForResult(intent, 666);
        }
        return jue.a;
    }
}
