# Scrolling Behaviors

## Horizontal scroll inside Vertical  scroll

Issue:
- Horizontal scroll is intercepted by vertical scroll

<img src="/assets/h_scr_in_v_scr.gif" width="200">

Desired behavior:
- Google Play app cards

<img src="/assets/g_play_scroll.gif" width="200">

Attempts to fix:
1) [NestedScrollView as a root + Use recycler.isNestedScrollingEnabled = false](/app/src/main/java/com/kirussell/scrollingbehaviors/horizontalinsidevertical/nestedscrollview/)
2) [RecyclerView inside RecyclerView](/app/src/main/java/com/kirussell/scrollingbehaviors/horizontalinsidevertical/recyclerinrecycler/)