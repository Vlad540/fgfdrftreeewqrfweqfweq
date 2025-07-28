package defpackage;

import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: tu7  reason: default package */
public final class tu7 implements ActionMode.Callback {
    public final EditText a;
    public final c9 b;
    public final HashSet c = new HashSet();

    public tu7(EditText editText, c9 c9Var) {
        this.a = editText;
        this.b = c9Var;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Editable text = editText.getText();
        int i = 0;
        if (!(text == null || text.length() == 0)) {
            int itemId = menuItem.getItemId();
            if (itemId == arb.markdown_bold) {
                mt0.A(text, selectionStart, selectionEnd, false, new so0(0));
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_italic) {
                mt0.A(text, selectionStart, selectionEnd, false, new so0(1));
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_underline) {
                mt0.A(text, selectionStart, selectionEnd, true, new wzd(1));
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_mono) {
                mt0.A(text, selectionStart, selectionEnd, true, new a69());
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_strikethrough) {
                mt0.A(text, selectionStart, selectionEnd, true, new wzd(0));
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_code) {
                mt0.A(text, selectionStart, selectionEnd, false, new j13());
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_link) {
                c9 c9Var = this.b;
                if (c9Var != null) {
                    lf7[] lf7Arr = (lf7[]) text.getSpans(selectionStart, selectionEnd, lf7.class);
                    if (lf7Arr != null && lf7Arr.length != 0) {
                        while (true) {
                            if (i >= lf7Arr.length) {
                                k77[] k77Arr = MessageWriteWidget.J0;
                                vu7 vu7 = (vu7) ((MessageWriteWidget) c9Var.b).c.getValue();
                                vu7.getClass();
                                taf.o(vu7.c, new aa(selectionStart, selectionEnd, (String) null));
                                break;
                            }
                            int i2 = i + 1;
                            try {
                                lf7 lf7 = lf7Arr[i];
                                int spanStart = text.getSpanStart(lf7);
                                int spanEnd = text.getSpanEnd(lf7);
                                if (spanStart == selectionStart && spanEnd == selectionEnd) {
                                    String str = lf7.b;
                                    k77[] k77Arr2 = MessageWriteWidget.J0;
                                    vu7 vu72 = (vu7) ((MessageWriteWidget) c9Var.b).c.getValue();
                                    vu72.getClass();
                                    taf.o(vu72.c, new aa(selectionStart, selectionEnd, str));
                                    break;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                    } else {
                        k77[] k77Arr3 = MessageWriteWidget.J0;
                        vu7 vu73 = (vu7) ((MessageWriteWidget) c9Var.b).c.getValue();
                        vu73.getClass();
                        taf.o(vu73.c, new aa(selectionStart, selectionEnd, (String) null));
                    }
                }
                return true;
            } else if (itemId == arb.markdown_heading) {
                mt0.A(text, selectionStart, selectionEnd, true, new af6());
                actionMode.finish();
                return true;
            } else if (itemId == arb.markdown_regular) {
                uu7[] uu7Arr = (uu7[]) text.getSpans(selectionStart, selectionEnd, uu7.class);
                if (uu7Arr.length != 0) {
                    int length = uu7Arr.length;
                    while (i < length) {
                        mt0.B(text, uu7Arr[i], selectionStart, selectionEnd);
                        i++;
                    }
                }
                actionMode.finish();
                return true;
            } else if (!(itemId == 16908320 || itemId == 16908321)) {
                udd.q("tu7", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(menuItem.getItemId())}, 1)));
            }
        }
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        HashSet hashSet = this.c;
        hashSet.clear();
        hashSet.add(16908320);
        hashSet.add(16908321);
        pu7.c.getClass();
        for (pu7 pu7 : pu7.X) {
            int i = pu7.a;
            menu.add(arb.markdown_group, i, 0, this.a.getResources().getString(pu7.b)).setShowAsAction(0);
            hashSet.add(Integer.valueOf(i));
        }
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.c.clear();
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        rg5 rg5 = new rg5(myc.L(new es(5, menu), new gw2(28, this)));
        while (rg5.hasNext()) {
            menu.removeItem(((MenuItem) rg5.next()).getItemId());
        }
        return true;
    }
}
