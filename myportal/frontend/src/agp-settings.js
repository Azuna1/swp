import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpSettings extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-text-area label="Bestellung eingegangen  E-Mail (an Herrn Schulte)" id="textAreaEingegangen" style="width:50%;"></vaadin-text-area>
 <vaadin-text-area label="Abholbereit E-Mail (an Kunde)" id="textAreaAbholen" style="width:50%;"></vaadin-text-area>
 <vaadin-text-area label="E-Mail an Buchhaltung" id="textAreaBuchhaltung" style="width:50%;"></vaadin-text-area>
 <vaadin-text-area label="E-Mail an Kunde" id="textAreaKunde" style="width:50%;"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-combo-box id="comboBoxLoeschen" placeholder="Kategorie löschen"></vaadin-combo-box>
  <vaadin-button theme="tertiary" id="buttonLoeschen" content="">
   Löschen
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
  <vaadin-text-field label="" placeholder="Kategorie hinzufügen" id="textFieldHinzufuegen"></vaadin-text-field>
  <vaadin-button theme="tertiary" id="buttonHinzufuegen">
   Hinzufügen 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-button theme="tertiary" id="buttonSpeichern">
  Einstellungen Speichern
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-settings';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpSettings.is, AgpSettings);
