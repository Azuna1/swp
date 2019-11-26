import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-split-layout/src/vaadin-split-layout.js';
import '@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-button.js';

class TestDesign extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-split-layout orientation="vertical" style="width: 100%; height: 100%;">
 <div style="flex-grow: 0; flex-shrink: 0; align-self: center;">
  <vaadin-menu-bar-button>
   menu1
  </vaadin-menu-bar-button>
  <vaadin-menu-bar-button>
   menu2
  </vaadin-menu-bar-button>
  <vaadin-menu-bar-button>
   menu3
  </vaadin-menu-bar-button>
  <vaadin-menu-bar-button>
   menu4
  </vaadin-menu-bar-button>
 </div>
 <div>
   Bottom content element 
 </div>
</vaadin-split-layout>
`;
    }

    static get is() {
        return 'test-design';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TestDesign.is, TestDesign);
