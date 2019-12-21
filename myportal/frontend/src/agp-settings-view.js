import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './agp-menu.js';
import './agp-settings.js';

class AgpSettingsView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="heitgh:10%; flex-shrink: 0;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 90%; justify-content: center;">
 <agp-settings id="agpSettings" style="width:100%;"></agp-settings>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'agp-settings-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpSettingsView.is, AgpSettingsView);
