package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: pn  reason: default package */
public abstract class pn {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        nfc nfc;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                nfc = new nfc(clipData, 3);
            } else {
                vp3 vp3 = new vp3();
                vp3.b = clipData;
                vp3.c = 3;
                nfc = vp3;
            }
            eaf.g(textView, nfc.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        nfc nfc;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            nfc = new nfc(clipData, 3);
        } else {
            vp3 vp3 = new vp3();
            vp3.b = clipData;
            vp3.c = 3;
            nfc = vp3;
        }
        eaf.g(view, nfc.build());
        return true;
    }
}
