/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hci;

import java.beans.*;

/**
 *
 * @author s0940608
 */
public class ImageLabellerBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( hci.ImageLabeller.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_active = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_alwaysOnTop = 4;
    private static final int PROPERTY_alwaysOnTopSupported = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_bounds = 9;
    private static final int PROPERTY_bufferStrategy = 10;
    private static final int PROPERTY_colorModel = 11;
    private static final int PROPERTY_component = 12;
    private static final int PROPERTY_componentCount = 13;
    private static final int PROPERTY_componentListeners = 14;
    private static final int PROPERTY_componentOrientation = 15;
    private static final int PROPERTY_components = 16;
    private static final int PROPERTY_containerListeners = 17;
    private static final int PROPERTY_contentPane = 18;
    private static final int PROPERTY_cursor = 19;
    private static final int PROPERTY_cursorSet = 20;
    private static final int PROPERTY_cursorType = 21;
    private static final int PROPERTY_defaultCloseOperation = 22;
    private static final int PROPERTY_displayable = 23;
    private static final int PROPERTY_doubleBuffered = 24;
    private static final int PROPERTY_dropTarget = 25;
    private static final int PROPERTY_enabled = 26;
    private static final int PROPERTY_extendedState = 27;
    private static final int PROPERTY_focusable = 28;
    private static final int PROPERTY_focusableWindow = 29;
    private static final int PROPERTY_focusableWindowState = 30;
    private static final int PROPERTY_focusCycleRoot = 31;
    private static final int PROPERTY_focusCycleRootAncestor = 32;
    private static final int PROPERTY_focused = 33;
    private static final int PROPERTY_focusListeners = 34;
    private static final int PROPERTY_focusOwner = 35;
    private static final int PROPERTY_focusTraversable = 36;
    private static final int PROPERTY_focusTraversalKeys = 37;
    private static final int PROPERTY_focusTraversalKeysEnabled = 38;
    private static final int PROPERTY_focusTraversalPolicy = 39;
    private static final int PROPERTY_focusTraversalPolicyProvider = 40;
    private static final int PROPERTY_focusTraversalPolicySet = 41;
    private static final int PROPERTY_font = 42;
    private static final int PROPERTY_fontSet = 43;
    private static final int PROPERTY_foreground = 44;
    private static final int PROPERTY_foregroundSet = 45;
    private static final int PROPERTY_glassPane = 46;
    private static final int PROPERTY_graphics = 47;
    private static final int PROPERTY_graphicsConfiguration = 48;
    private static final int PROPERTY_height = 49;
    private static final int PROPERTY_hierarchyBoundsListeners = 50;
    private static final int PROPERTY_hierarchyListeners = 51;
    private static final int PROPERTY_iconImage = 52;
    private static final int PROPERTY_iconImages = 53;
    private static final int PROPERTY_ignoreRepaint = 54;
    private static final int PROPERTY_inputContext = 55;
    private static final int PROPERTY_inputMethodListeners = 56;
    private static final int PROPERTY_inputMethodRequests = 57;
    private static final int PROPERTY_insets = 58;
    private static final int PROPERTY_JMenuBar = 59;
    private static final int PROPERTY_keyListeners = 60;
    private static final int PROPERTY_layeredPane = 61;
    private static final int PROPERTY_layout = 62;
    private static final int PROPERTY_lightweight = 63;
    private static final int PROPERTY_locale = 64;
    private static final int PROPERTY_location = 65;
    private static final int PROPERTY_locationByPlatform = 66;
    private static final int PROPERTY_locationOnScreen = 67;
    private static final int PROPERTY_locationRelativeTo = 68;
    private static final int PROPERTY_maximizedBounds = 69;
    private static final int PROPERTY_maximumSize = 70;
    private static final int PROPERTY_maximumSizeSet = 71;
    private static final int PROPERTY_menuBar = 72;
    private static final int PROPERTY_minimumSize = 73;
    private static final int PROPERTY_minimumSizeSet = 74;
    private static final int PROPERTY_modalExclusionType = 75;
    private static final int PROPERTY_mostRecentFocusOwner = 76;
    private static final int PROPERTY_mouseListeners = 77;
    private static final int PROPERTY_mouseMotionListeners = 78;
    private static final int PROPERTY_mousePosition = 79;
    private static final int PROPERTY_mouseWheelListeners = 80;
    private static final int PROPERTY_name = 81;
    private static final int PROPERTY_opaque = 82;
    private static final int PROPERTY_ownedWindows = 83;
    private static final int PROPERTY_owner = 84;
    private static final int PROPERTY_parent = 85;
    private static final int PROPERTY_peer = 86;
    private static final int PROPERTY_preferredSize = 87;
    private static final int PROPERTY_preferredSizeSet = 88;
    private static final int PROPERTY_propertyChangeListeners = 89;
    private static final int PROPERTY_resizable = 90;
    private static final int PROPERTY_rootPane = 91;
    private static final int PROPERTY_showing = 92;
    private static final int PROPERTY_size = 93;
    private static final int PROPERTY_state = 94;
    private static final int PROPERTY_title = 95;
    private static final int PROPERTY_toolkit = 96;
    private static final int PROPERTY_transferHandler = 97;
    private static final int PROPERTY_treeLock = 98;
    private static final int PROPERTY_undecorated = 99;
    private static final int PROPERTY_upGUI = 100;
    private static final int PROPERTY_valid = 101;
    private static final int PROPERTY_visible = 102;
    private static final int PROPERTY_warningString = 103;
    private static final int PROPERTY_width = 104;
    private static final int PROPERTY_windowFocusListeners = 105;
    private static final int PROPERTY_windowListeners = 106;
    private static final int PROPERTY_windowStateListeners = 107;
    private static final int PROPERTY_x = 108;
    private static final int PROPERTY_y = 109;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[110];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", hci.ImageLabeller.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_active] = new PropertyDescriptor ( "active", hci.ImageLabeller.class, "isActive", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", hci.ImageLabeller.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", hci.ImageLabeller.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_alwaysOnTop] = new PropertyDescriptor ( "alwaysOnTop", hci.ImageLabeller.class, "isAlwaysOnTop", "setAlwaysOnTop" ); // NOI18N
            properties[PROPERTY_alwaysOnTopSupported] = new PropertyDescriptor ( "alwaysOnTopSupported", hci.ImageLabeller.class, "isAlwaysOnTopSupported", null ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", hci.ImageLabeller.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", hci.ImageLabeller.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", hci.ImageLabeller.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", hci.ImageLabeller.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_bufferStrategy] = new PropertyDescriptor ( "bufferStrategy", hci.ImageLabeller.class, "getBufferStrategy", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", hci.ImageLabeller.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", hci.ImageLabeller.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", hci.ImageLabeller.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", hci.ImageLabeller.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", hci.ImageLabeller.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", hci.ImageLabeller.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", hci.ImageLabeller.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentPane] = new PropertyDescriptor ( "contentPane", hci.ImageLabeller.class, "getContentPane", "setContentPane" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", hci.ImageLabeller.class, null, "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", hci.ImageLabeller.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_cursorType] = new PropertyDescriptor ( "cursorType", hci.ImageLabeller.class, "getCursorType", null ); // NOI18N
            properties[PROPERTY_defaultCloseOperation] = new PropertyDescriptor ( "defaultCloseOperation", hci.ImageLabeller.class, "getDefaultCloseOperation", "setDefaultCloseOperation" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", hci.ImageLabeller.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", hci.ImageLabeller.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", hci.ImageLabeller.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", hci.ImageLabeller.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_extendedState] = new PropertyDescriptor ( "extendedState", hci.ImageLabeller.class, "getExtendedState", "setExtendedState" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", hci.ImageLabeller.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusableWindow] = new PropertyDescriptor ( "focusableWindow", hci.ImageLabeller.class, "isFocusableWindow", null ); // NOI18N
            properties[PROPERTY_focusableWindowState] = new PropertyDescriptor ( "focusableWindowState", hci.ImageLabeller.class, "getFocusableWindowState", "setFocusableWindowState" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", hci.ImageLabeller.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", hci.ImageLabeller.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focused] = new PropertyDescriptor ( "focused", hci.ImageLabeller.class, "isFocused", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", hci.ImageLabeller.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", hci.ImageLabeller.class, "getFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", hci.ImageLabeller.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", hci.ImageLabeller.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", hci.ImageLabeller.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", hci.ImageLabeller.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", hci.ImageLabeller.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", hci.ImageLabeller.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", hci.ImageLabeller.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", hci.ImageLabeller.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", hci.ImageLabeller.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", hci.ImageLabeller.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_glassPane] = new PropertyDescriptor ( "glassPane", hci.ImageLabeller.class, "getGlassPane", "setGlassPane" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", hci.ImageLabeller.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", hci.ImageLabeller.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", hci.ImageLabeller.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", hci.ImageLabeller.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", hci.ImageLabeller.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_iconImage] = new PropertyDescriptor ( "iconImage", hci.ImageLabeller.class, "getIconImage", "setIconImage" ); // NOI18N
            properties[PROPERTY_iconImages] = new PropertyDescriptor ( "iconImages", hci.ImageLabeller.class, null, "setIconImages" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", hci.ImageLabeller.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", hci.ImageLabeller.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", hci.ImageLabeller.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", hci.ImageLabeller.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", hci.ImageLabeller.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_JMenuBar] = new PropertyDescriptor ( "JMenuBar", hci.ImageLabeller.class, "getJMenuBar", "setJMenuBar" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", hci.ImageLabeller.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layeredPane] = new PropertyDescriptor ( "layeredPane", hci.ImageLabeller.class, "getLayeredPane", "setLayeredPane" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", hci.ImageLabeller.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", hci.ImageLabeller.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", hci.ImageLabeller.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", hci.ImageLabeller.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationByPlatform] = new PropertyDescriptor ( "locationByPlatform", hci.ImageLabeller.class, "isLocationByPlatform", "setLocationByPlatform" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", hci.ImageLabeller.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_locationRelativeTo] = new PropertyDescriptor ( "locationRelativeTo", hci.ImageLabeller.class, null, "setLocationRelativeTo" ); // NOI18N
            properties[PROPERTY_maximizedBounds] = new PropertyDescriptor ( "maximizedBounds", hci.ImageLabeller.class, "getMaximizedBounds", "setMaximizedBounds" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", hci.ImageLabeller.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", hci.ImageLabeller.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menuBar] = new PropertyDescriptor ( "menuBar", hci.ImageLabeller.class, "getMenuBar", "setMenuBar" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", hci.ImageLabeller.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", hci.ImageLabeller.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_modalExclusionType] = new PropertyDescriptor ( "modalExclusionType", hci.ImageLabeller.class, "getModalExclusionType", "setModalExclusionType" ); // NOI18N
            properties[PROPERTY_mostRecentFocusOwner] = new PropertyDescriptor ( "mostRecentFocusOwner", hci.ImageLabeller.class, "getMostRecentFocusOwner", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", hci.ImageLabeller.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", hci.ImageLabeller.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", hci.ImageLabeller.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", hci.ImageLabeller.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", hci.ImageLabeller.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", hci.ImageLabeller.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_ownedWindows] = new PropertyDescriptor ( "ownedWindows", hci.ImageLabeller.class, "getOwnedWindows", null ); // NOI18N
            properties[PROPERTY_owner] = new PropertyDescriptor ( "owner", hci.ImageLabeller.class, "getOwner", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", hci.ImageLabeller.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", hci.ImageLabeller.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", hci.ImageLabeller.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", hci.ImageLabeller.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", hci.ImageLabeller.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_resizable] = new PropertyDescriptor ( "resizable", hci.ImageLabeller.class, "isResizable", "setResizable" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", hci.ImageLabeller.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", hci.ImageLabeller.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", hci.ImageLabeller.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_state] = new PropertyDescriptor ( "state", hci.ImageLabeller.class, "getState", "setState" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", hci.ImageLabeller.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", hci.ImageLabeller.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", hci.ImageLabeller.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", hci.ImageLabeller.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_undecorated] = new PropertyDescriptor ( "undecorated", hci.ImageLabeller.class, "isUndecorated", "setUndecorated" ); // NOI18N
            properties[PROPERTY_upGUI] = new PropertyDescriptor ( "upGUI", hci.ImageLabeller.class, null, "setupGUI" ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", hci.ImageLabeller.class, "isValid", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", hci.ImageLabeller.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_warningString] = new PropertyDescriptor ( "warningString", hci.ImageLabeller.class, "getWarningString", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", hci.ImageLabeller.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_windowFocusListeners] = new PropertyDescriptor ( "windowFocusListeners", hci.ImageLabeller.class, "getWindowFocusListeners", null ); // NOI18N
            properties[PROPERTY_windowListeners] = new PropertyDescriptor ( "windowListeners", hci.ImageLabeller.class, "getWindowListeners", null ); // NOI18N
            properties[PROPERTY_windowStateListeners] = new PropertyDescriptor ( "windowStateListeners", hci.ImageLabeller.class, "getWindowStateListeners", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", hci.ImageLabeller.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", hci.ImageLabeller.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties
    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_containerListener = 1;
    private static final int EVENT_focusListener = 2;
    private static final int EVENT_hierarchyBoundsListener = 3;
    private static final int EVENT_hierarchyListener = 4;
    private static final int EVENT_inputMethodListener = 5;
    private static final int EVENT_keyListener = 6;
    private static final int EVENT_mouseListener = 7;
    private static final int EVENT_mouseMotionListener = 8;
    private static final int EVENT_mouseWheelListener = 9;
    private static final int EVENT_propertyChangeListener = 10;
    private static final int EVENT_windowFocusListener = 11;
    private static final int EVENT_windowListener = 12;
    private static final int EVENT_windowStateListener = 13;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[14];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_windowFocusListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "windowFocusListener", java.awt.event.WindowFocusListener.class, new String[] {"windowGainedFocus", "windowLostFocus"}, "addWindowFocusListener", "removeWindowFocusListener" ); // NOI18N
            eventSets[EVENT_windowListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "windowListener", java.awt.event.WindowListener.class, new String[] {"windowOpened", "windowClosing", "windowClosed", "windowIconified", "windowDeiconified", "windowActivated", "windowDeactivated"}, "addWindowListener", "removeWindowListener" ); // NOI18N
            eventSets[EVENT_windowStateListener] = new EventSetDescriptor ( hci.ImageLabeller.class, "windowStateListener", java.awt.event.WindowStateListener.class, new String[] {"windowStateChanged"}, "addWindowStateListener", "removeWindowStateListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events
    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNewPolygon7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_applyResourceBundle11 = 11;
    private static final int METHOD_applyResourceBundle12 = 12;
    private static final int METHOD_areFocusTraversalKeysSet13 = 13;
    private static final int METHOD_bounds14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_checkImage16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_contains18 = 18;
    private static final int METHOD_countComponents19 = 19;
    private static final int METHOD_createBufferStrategy20 = 20;
    private static final int METHOD_createBufferStrategy21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_createVolatileImage25 = 25;
    private static final int METHOD_deliverEvent26 = 26;
    private static final int METHOD_disable27 = 27;
    private static final int METHOD_dispatchEvent28 = 28;
    private static final int METHOD_dispose29 = 29;
    private static final int METHOD_doLayout30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enableInputMethods33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_getBaseline42 = 42;
    private static final int METHOD_getBounds43 = 43;
    private static final int METHOD_getComponentAt44 = 44;
    private static final int METHOD_getComponentAt45 = 45;
    private static final int METHOD_getComponentZOrder46 = 46;
    private static final int METHOD_getCursor47 = 47;
    private static final int METHOD_getFontMetrics48 = 48;
    private static final int METHOD_getFrames49 = 49;
    private static final int METHOD_getIconImages50 = 50;
    private static final int METHOD_getListeners51 = 51;
    private static final int METHOD_getLocation52 = 52;
    private static final int METHOD_getMousePosition53 = 53;
    private static final int METHOD_getOwnerlessWindows54 = 54;
    private static final int METHOD_getPropertyChangeListeners55 = 55;
    private static final int METHOD_getSize56 = 56;
    private static final int METHOD_getWindows57 = 57;
    private static final int METHOD_gotFocus58 = 58;
    private static final int METHOD_handleEvent59 = 59;
    private static final int METHOD_hasFocus60 = 60;
    private static final int METHOD_hide61 = 61;
    private static final int METHOD_imageUpdate62 = 62;
    private static final int METHOD_insets63 = 63;
    private static final int METHOD_inside64 = 64;
    private static final int METHOD_invalidate65 = 65;
    private static final int METHOD_isAncestorOf66 = 66;
    private static final int METHOD_isDefaultLookAndFeelDecorated67 = 67;
    private static final int METHOD_isFocusCycleRoot68 = 68;
    private static final int METHOD_isFocusOwner69 = 69;
    private static final int METHOD_keyDown70 = 70;
    private static final int METHOD_keyUp71 = 71;
    private static final int METHOD_layout72 = 72;
    private static final int METHOD_list73 = 73;
    private static final int METHOD_list74 = 74;
    private static final int METHOD_list75 = 75;
    private static final int METHOD_list76 = 76;
    private static final int METHOD_list77 = 77;
    private static final int METHOD_locate78 = 78;
    private static final int METHOD_location79 = 79;
    private static final int METHOD_lostFocus80 = 80;
    private static final int METHOD_main81 = 81;
    private static final int METHOD_minimumSize82 = 82;
    private static final int METHOD_mouseDown83 = 83;
    private static final int METHOD_mouseDrag84 = 84;
    private static final int METHOD_mouseEnter85 = 85;
    private static final int METHOD_mouseExit86 = 86;
    private static final int METHOD_mouseMove87 = 87;
    private static final int METHOD_mouseUp88 = 88;
    private static final int METHOD_move89 = 89;
    private static final int METHOD_nextFocus90 = 90;
    private static final int METHOD_pack91 = 91;
    private static final int METHOD_paint92 = 92;
    private static final int METHOD_paintAll93 = 93;
    private static final int METHOD_paintComponents94 = 94;
    private static final int METHOD_postEvent95 = 95;
    private static final int METHOD_preferredSize96 = 96;
    private static final int METHOD_prepareImage97 = 97;
    private static final int METHOD_prepareImage98 = 98;
    private static final int METHOD_print99 = 99;
    private static final int METHOD_printAll100 = 100;
    private static final int METHOD_printComponents101 = 101;
    private static final int METHOD_remove102 = 102;
    private static final int METHOD_remove103 = 103;
    private static final int METHOD_remove104 = 104;
    private static final int METHOD_removeAll105 = 105;
    private static final int METHOD_removeNotify106 = 106;
    private static final int METHOD_removePropertyChangeListener107 = 107;
    private static final int METHOD_repaint108 = 108;
    private static final int METHOD_repaint109 = 109;
    private static final int METHOD_repaint110 = 110;
    private static final int METHOD_repaint111 = 111;
    private static final int METHOD_requestFocus112 = 112;
    private static final int METHOD_requestFocusInWindow113 = 113;
    private static final int METHOD_reshape114 = 114;
    private static final int METHOD_resize115 = 115;
    private static final int METHOD_resize116 = 116;
    private static final int METHOD_setBounds117 = 117;
    private static final int METHOD_setComponentZOrder118 = 118;
    private static final int METHOD_setCursor119 = 119;
    private static final int METHOD_setDefaultLookAndFeelDecorated120 = 120;
    private static final int METHOD_setFocusTraversalKeys121 = 121;
    private static final int METHOD_show122 = 122;
    private static final int METHOD_show123 = 123;
    private static final int METHOD_size124 = 124;
    private static final int METHOD_toBack125 = 125;
    private static final int METHOD_toFront126 = 126;
    private static final int METHOD_toString127 = 127;
    private static final int METHOD_transferFocus128 = 128;
    private static final int METHOD_transferFocusBackward129 = 129;
    private static final int METHOD_transferFocusDownCycle130 = 130;
    private static final int METHOD_transferFocusUpCycle131 = 131;
    private static final int METHOD_update132 = 132;
    private static final int METHOD_validate133 = 133;
    private static final int METHOD_valueChanged134 = 134;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[135];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNewPolygon7] = new MethodDescriptor(hci.ImageLabeller.class.getMethod("addNewPolygon", new Class[] {})); // NOI18N
            methods[METHOD_addNewPolygon7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(java.awt.Frame.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Window.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle11] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.util.ResourceBundle.class})); // NOI18N
            methods[METHOD_applyResourceBundle11].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle12] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_applyResourceBundle12].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet13] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet13].setDisplayName ( "" );
            methods[METHOD_bounds14] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_checkImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_contains18] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains18].setDisplayName ( "" );
            methods[METHOD_countComponents19] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents19].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy20] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class})); // NOI18N
            methods[METHOD_createBufferStrategy20].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy21] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class, java.awt.BufferCapabilities.class})); // NOI18N
            methods[METHOD_createBufferStrategy21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_createVolatileImage25] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage25].setDisplayName ( "" );
            methods[METHOD_deliverEvent26] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent26].setDisplayName ( "" );
            methods[METHOD_disable27] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable27].setDisplayName ( "" );
            methods[METHOD_dispatchEvent28] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent28].setDisplayName ( "" );
            methods[METHOD_dispose29] = new MethodDescriptor(java.awt.Window.class.getMethod("dispose", new Class[] {})); // NOI18N
            methods[METHOD_dispose29].setDisplayName ( "" );
            methods[METHOD_doLayout30] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enableInputMethods33] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_getBaseline42] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline42].setDisplayName ( "" );
            methods[METHOD_getBounds43] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds43].setDisplayName ( "" );
            methods[METHOD_getComponentAt44] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt44].setDisplayName ( "" );
            methods[METHOD_getComponentAt45] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt45].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder46].setDisplayName ( "" );
            methods[METHOD_getCursor47] = new MethodDescriptor(java.awt.Component.class.getMethod("getCursor", new Class[] {})); // NOI18N
            methods[METHOD_getCursor47].setDisplayName ( "" );
            methods[METHOD_getFontMetrics48] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics48].setDisplayName ( "" );
            methods[METHOD_getFrames49] = new MethodDescriptor(java.awt.Frame.class.getMethod("getFrames", new Class[] {})); // NOI18N
            methods[METHOD_getFrames49].setDisplayName ( "" );
            methods[METHOD_getIconImages50] = new MethodDescriptor(java.awt.Window.class.getMethod("getIconImages", new Class[] {})); // NOI18N
            methods[METHOD_getIconImages50].setDisplayName ( "" );
            methods[METHOD_getListeners51] = new MethodDescriptor(java.awt.Window.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners51].setDisplayName ( "" );
            methods[METHOD_getLocation52] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation52].setDisplayName ( "" );
            methods[METHOD_getMousePosition53] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition53].setDisplayName ( "" );
            methods[METHOD_getOwnerlessWindows54] = new MethodDescriptor(java.awt.Window.class.getMethod("getOwnerlessWindows", new Class[] {})); // NOI18N
            methods[METHOD_getOwnerlessWindows54].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners55] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners55].setDisplayName ( "" );
            methods[METHOD_getSize56] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize56].setDisplayName ( "" );
            methods[METHOD_getWindows57] = new MethodDescriptor(java.awt.Window.class.getMethod("getWindows", new Class[] {})); // NOI18N
            methods[METHOD_getWindows57].setDisplayName ( "" );
            methods[METHOD_gotFocus58] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus58].setDisplayName ( "" );
            methods[METHOD_handleEvent59] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent59].setDisplayName ( "" );
            methods[METHOD_hasFocus60] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus60].setDisplayName ( "" );
            methods[METHOD_hide61] = new MethodDescriptor(java.awt.Window.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide61].setDisplayName ( "" );
            methods[METHOD_imageUpdate62] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate62].setDisplayName ( "" );
            methods[METHOD_insets63] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets63].setDisplayName ( "" );
            methods[METHOD_inside64] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside64].setDisplayName ( "" );
            methods[METHOD_invalidate65] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate65].setDisplayName ( "" );
            methods[METHOD_isAncestorOf66] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf66].setDisplayName ( "" );
            methods[METHOD_isDefaultLookAndFeelDecorated67] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("isDefaultLookAndFeelDecorated", new Class[] {})); // NOI18N
            methods[METHOD_isDefaultLookAndFeelDecorated67].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot68] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot68].setDisplayName ( "" );
            methods[METHOD_isFocusOwner69] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusOwner", new Class[] {})); // NOI18N
            methods[METHOD_isFocusOwner69].setDisplayName ( "" );
            methods[METHOD_keyDown70] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown70].setDisplayName ( "" );
            methods[METHOD_keyUp71] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp71].setDisplayName ( "" );
            methods[METHOD_layout72] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout72].setDisplayName ( "" );
            methods[METHOD_list73] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list73].setDisplayName ( "" );
            methods[METHOD_list74] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list74].setDisplayName ( "" );
            methods[METHOD_list75] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list75].setDisplayName ( "" );
            methods[METHOD_list76] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list76].setDisplayName ( "" );
            methods[METHOD_list77] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list77].setDisplayName ( "" );
            methods[METHOD_locate78] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate78].setDisplayName ( "" );
            methods[METHOD_location79] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location79].setDisplayName ( "" );
            methods[METHOD_lostFocus80] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus80].setDisplayName ( "" );
            methods[METHOD_main81] = new MethodDescriptor(hci.ImageLabeller.class.getMethod("main", new Class[] {java.lang.String[].class})); // NOI18N
            methods[METHOD_main81].setDisplayName ( "" );
            methods[METHOD_minimumSize82] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize82].setDisplayName ( "" );
            methods[METHOD_mouseDown83] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown83].setDisplayName ( "" );
            methods[METHOD_mouseDrag84] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag84].setDisplayName ( "" );
            methods[METHOD_mouseEnter85] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter85].setDisplayName ( "" );
            methods[METHOD_mouseExit86] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit86].setDisplayName ( "" );
            methods[METHOD_mouseMove87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove87].setDisplayName ( "" );
            methods[METHOD_mouseUp88] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp88].setDisplayName ( "" );
            methods[METHOD_move89] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move89].setDisplayName ( "" );
            methods[METHOD_nextFocus90] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus90].setDisplayName ( "" );
            methods[METHOD_pack91] = new MethodDescriptor(java.awt.Window.class.getMethod("pack", new Class[] {})); // NOI18N
            methods[METHOD_pack91].setDisplayName ( "" );
            methods[METHOD_paint92] = new MethodDescriptor(hci.ImageLabeller.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint92].setDisplayName ( "" );
            methods[METHOD_paintAll93] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll93].setDisplayName ( "" );
            methods[METHOD_paintComponents94] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents94].setDisplayName ( "" );
            methods[METHOD_postEvent95] = new MethodDescriptor(java.awt.Window.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent95].setDisplayName ( "" );
            methods[METHOD_preferredSize96] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize96].setDisplayName ( "" );
            methods[METHOD_prepareImage97] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage97].setDisplayName ( "" );
            methods[METHOD_prepareImage98] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage98].setDisplayName ( "" );
            methods[METHOD_print99] = new MethodDescriptor(java.awt.Container.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print99].setDisplayName ( "" );
            methods[METHOD_printAll100] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll100].setDisplayName ( "" );
            methods[METHOD_printComponents101] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents101].setDisplayName ( "" );
            methods[METHOD_remove102] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove102].setDisplayName ( "" );
            methods[METHOD_remove103] = new MethodDescriptor(java.awt.Frame.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove103].setDisplayName ( "" );
            methods[METHOD_remove104] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove104].setDisplayName ( "" );
            methods[METHOD_removeAll105] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll105].setDisplayName ( "" );
            methods[METHOD_removeNotify106] = new MethodDescriptor(java.awt.Frame.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify106].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener107] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener107].setDisplayName ( "" );
            methods[METHOD_repaint108] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint108].setDisplayName ( "" );
            methods[METHOD_repaint109] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint109].setDisplayName ( "" );
            methods[METHOD_repaint110] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint110].setDisplayName ( "" );
            methods[METHOD_repaint111] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint111].setDisplayName ( "" );
            methods[METHOD_requestFocus112] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus112].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow113] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow113].setDisplayName ( "" );
            methods[METHOD_reshape114] = new MethodDescriptor(java.awt.Window.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape114].setDisplayName ( "" );
            methods[METHOD_resize115] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize115].setDisplayName ( "" );
            methods[METHOD_resize116] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize116].setDisplayName ( "" );
            methods[METHOD_setBounds117] = new MethodDescriptor(java.awt.Window.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds117].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder118] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder118].setDisplayName ( "" );
            methods[METHOD_setCursor119] = new MethodDescriptor(java.awt.Window.class.getMethod("setCursor", new Class[] {java.awt.Cursor.class})); // NOI18N
            methods[METHOD_setCursor119].setDisplayName ( "" );
            methods[METHOD_setDefaultLookAndFeelDecorated120] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("setDefaultLookAndFeelDecorated", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_setDefaultLookAndFeelDecorated120].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys121] = new MethodDescriptor(java.awt.Container.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys121].setDisplayName ( "" );
            methods[METHOD_show122] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show122].setDisplayName ( "" );
            methods[METHOD_show123] = new MethodDescriptor(java.awt.Window.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show123].setDisplayName ( "" );
            methods[METHOD_size124] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size124].setDisplayName ( "" );
            methods[METHOD_toBack125] = new MethodDescriptor(java.awt.Window.class.getMethod("toBack", new Class[] {})); // NOI18N
            methods[METHOD_toBack125].setDisplayName ( "" );
            methods[METHOD_toFront126] = new MethodDescriptor(java.awt.Window.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront126].setDisplayName ( "" );
            methods[METHOD_toString127] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString127].setDisplayName ( "" );
            methods[METHOD_transferFocus128] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus128].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward129] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward129].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle130] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle130].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle131] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle131].setDisplayName ( "" );
            methods[METHOD_update132] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update132].setDisplayName ( "" );
            methods[METHOD_validate133] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate133].setDisplayName ( "" );
            methods[METHOD_valueChanged134] = new MethodDescriptor(hci.ImageLabeller.class.getMethod("valueChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_valueChanged134].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.
//GEN-LAST:Superclass
    /**
     * Gets the bean's
     * <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's
     * <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis. <p> If a property is indexed,
     * then its entry in the result array will belong to the
     * IndexedPropertyDescriptor subclass of PropertyDescriptor. A client of
     * getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's
     * <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's
     * <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors. <P>	Returns -1 if there is no default
     * property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors. <P>	Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats. <p> Beans aren't required to provide
     * icons and may return null from this method. <p> There are four possible
     * flavors of icons (16x16 color, 32x32 color, 16x16 mono, 32x32 mono). If a
     * bean choses to only support a single icon we recommend supporting 16x16
     * color. <p> We recommend that icons have a "transparent" background so
     * they can be rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
}
