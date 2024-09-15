import React, { useState } from 'react';
import { NativeModules, Button, TextInput, View, Text } from 'react-native';

const { UnityModule } = NativeModules;

const App = () => {
  const [playerName, setPlayerName] = useState('');
  const [walletAmount, setWalletAmount] = useState('');
  const [bettingAmount, setBettingAmount] = useState('');

  const startUnityGame = () => {
    if (playerName && walletAmount && bettingAmount) {
      // Send the player data to Unity
      UnityModule.launchUnityWithParams(playerName, walletAmount, bettingAmount);
    } else {
      alert('Please fill out all fields!');
    }
  };

  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <TextInput
        placeholder="Enter Player Name"
        value={playerName}
        onChangeText={setPlayerName}
        style={{ height: 40, borderColor: 'gray', borderWidth: 1, marginBottom: 10, width: 200 }}
      />
      <TextInput
        placeholder="Enter Wallet Amount"
        value={walletAmount}
        onChangeText={setWalletAmount}
        keyboardType="numeric"
        style={{ height: 40, borderColor: 'gray', borderWidth: 1, marginBottom: 10, width: 200 }}
      />
      <TextInput
        placeholder="Enter Betting Amount"
        value={bettingAmount}
        onChangeText={setBettingAmount}
        keyboardType="numeric"
        style={{ height: 40, borderColor: 'gray', borderWidth: 1, marginBottom: 10, width: 200 }}
      />
      <Button title="Start Unity Game" onPress={startUnityGame} />
    </View>
  );
};

export default App;
