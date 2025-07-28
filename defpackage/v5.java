package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: v5  reason: default package */
public final class v5 extends l5e implements i26 {
    public final /* synthetic */ ActChatPickerCompat X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ ArrayList w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v5(ActChatPickerCompat actChatPickerCompat, ArrayList arrayList, String str, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.X = actChatPickerCompat;
        this.Y = arrayList;
        this.Z = str;
        this.w0 = arrayList2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((v5) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v5(this.X, this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = ActChatPickerCompat.P0;
        ActChatPickerCompat actChatPickerCompat = this.X;
        actChatPickerCompat.getClass();
        ArrayList arrayList = this.Y;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("ru.ok.tamtam.extra.CHAT_IDS", o23.t0(arrayList));
            intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_IDS", o23.t0(this.w0));
            if (actChatPickerCompat.getIntent().hasExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE")) {
                intent.putExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE", actChatPickerCompat.getIntent().getBundleExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE"));
            }
            String str = this.Z;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                intent.putExtra("ru.ok.tamtam.extra.DESCRIPTION", str);
            }
            if (actChatPickerCompat.getIntent().hasExtra("ru.ok.tamtam.extra_FOLDER_ID")) {
                intent.putExtra("ru.ok.tamtam.extra_FOLDER_ID", actChatPickerCompat.getIntent().getStringExtra("ru.ok.tamtam.extra_FOLDER_ID"));
            }
            intent.putExtra("act:chat_picker:serial", actChatPickerCompat.getIntent().getSerializableExtra("act:chat_picker:serial"));
            actChatPickerCompat.setResult(-1, intent);
        } else {
            actChatPickerCompat.setResult(0);
        }
        actChatPickerCompat.finish();
        return jue.a;
    }
}
